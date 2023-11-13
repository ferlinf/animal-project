package com.example.projectanimals;

import android.app.AlertDialog;
import android.widget.Toast;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.widget.RadioButton;
import android.widget.RadioGroup;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editTextUmur;
    EditText nama;

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.nama);
        editTextUmur = findViewById(R.id.umur);
        nama = findViewById(R.id.nama);
        radioGroup = findViewById(R.id.group_Radio);

    }

    public void tombolSubmit(View view) {
        String namaString = nama.getText().toString();
        String umurString = editTextUmur.getText().toString();

        if (namaString.isEmpty()) {
            showToast("Isi nama kamu dulu ya");
            return;
        }

        if (containsDigit(namaString)) {
            showToast("Nama tidak boleh mengandung angka");
            return;
        }

        if (umurString.isEmpty()) {
            showToast("isi umur kamu dulu ya");
            return;
        }

        int umur = Integer.parseInt(umurString);

        if (umur < 5) {
            showAlertDialog("Umur harus lebih dari 4 tahun untuk melanjutkan.");
            return;
        }

        int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        if (selectedRadioButtonId == -1) {
            showToast("Pilih jenis kelamin terlebih dahulu");
            return;
        }


        RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);
        String selectedAnimal = selectedRadioButton.getText().toString();

        Intent intent = new Intent(this, HomeActivity.class);
        String message = editText1.getText().toString();
        intent.putExtra("EXTRA_MESSAGE", message);
        intent.putExtra("EXTRA_ANIMAL", selectedRadioButtonId);
        startActivity(intent);

        }
    private boolean containsDigit(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void showAlertDialog(String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked OK button
                    }
                });
        builder.create().show();
    }
}
