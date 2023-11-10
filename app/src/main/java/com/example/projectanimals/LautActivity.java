package com.example.projectanimals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LautActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laut);

        textView = findViewById(R.id.nama); // asumsikan Anda memiliki TextView dengan id textViewResult

        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");
        textView.setText("halo " + message);
    }

    public void kepiting(View view) {
        Intent intent = new Intent(this,KepitingActivity.class);
        startActivity(intent);
    }

    public void nemo(View view) {
        Intent intent = new Intent(this,NemoActivity.class);
        startActivity(intent);
    }

    public void kura(View view) {
        Intent intent = new Intent(this,kuraActivity.class);
        startActivity(intent);
    }

    public void paus(View view) {
        Intent intent = new Intent(this,PausActivity.class);
        startActivity(intent);
    }

    public void hiu(View view) {
        Intent intent = new Intent(this,HiuActivity.class);
        startActivity(intent);
    }
}
