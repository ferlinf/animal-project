package com.example.projectanimals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RawrActivity extends AppCompatActivity {
    ImageView arrowBackImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rawr);

        ImageView arrowBackImageView = findViewById(R.id.arrowBackImageView);
        arrowBackImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RawrActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    public void videoRawr(View view) {
        String videoId = "https://youtu.be/jv8AbKRc8X0?si=P9LxPsAEliVsn0FX";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube" + videoId));
        intent.putExtra("VIDEO_ID", videoId);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/jv8AbKRc8X0?si=P9LxPsAEliVsn0FX" + videoId));
            startActivity(intent);
        }
    }
}