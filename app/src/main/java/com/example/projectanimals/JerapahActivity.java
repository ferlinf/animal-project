package com.example.projectanimals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class JerapahActivity extends AppCompatActivity {
    ImageView arrowBackImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jerapah);


        ImageView arrowBackImageView = findViewById(R.id.arrowBackImageView);
        arrowBackImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JerapahActivity.this, HomeActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                intent.putExtra("SELECTED_TAB", "DaratFragment");
                startActivity(intent);
            }
        });
    }

    public void videoJerapah(View view) {
        String videoId = "https://youtu.be/P_ckAbOr0r4?si=cdrPEaNgL4QEGuWU";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube" + videoId));
        intent.putExtra("VIDEO_ID", videoId);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/P_ckAbOr0r4?si=cdrPEaNgL4QEGuWU" + videoId));
            startActivity(intent);
        }
    }
}