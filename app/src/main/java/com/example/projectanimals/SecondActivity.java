package com.example.projectanimals;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        textView = findViewById(R.id.nama); // asumsikan Anda memiliki TextView dengan id textViewResult

        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");
        textView.setText("halo " + message);
    }

    public void badak(View view) {
        Intent intent = new Intent(this,BadakActivity.class);
        startActivity(intent);
    }

    public void jerapah(View view) {
        Intent intent = new Intent(this,JerapahActivity.class);
        startActivity(intent);
    }

    public void rawr(View view) {
        Intent intent = new Intent(this,RawrActivity.class);
        startActivity(intent);
    }
}
