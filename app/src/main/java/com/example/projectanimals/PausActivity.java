package com.example.projectanimals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PausActivity extends AppCompatActivity {
    ImageView arrowBackImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paus);

        ImageView arrowBackImageView = findViewById(R.id.arrowBackImageView);
        arrowBackImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PausActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }

    public void videoPaus(View view) {
        String videoId = "https://youtu.be/bgiPTUy2RqI?si=6NAdIibxJlHKDuqG";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube"+videoId));
        intent.putExtra("VIDEO_ID", videoId);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/bgiPTUy2RqI?si=6NAdIibxJlHKDuqG" + videoId));
            startActivity(intent);
        }
    }
}