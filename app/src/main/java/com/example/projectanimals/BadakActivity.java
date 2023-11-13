package com.example.projectanimals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.content.ActivityNotFoundException;


public class BadakActivity extends AppCompatActivity {
ImageView arrowBackImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badak);

        ImageView arrowBackImageView = findViewById(R.id.arrowBackImageView);
        arrowBackImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BadakActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

    }

    public void videoBadak(View view) {
        String videoId = "https://youtu.be/FcJrQ9pUq5k?si=1YU5gvYgjnXj547s";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube"+videoId));
        intent.putExtra("VIDEO_ID", videoId);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/FcJrQ9pUq5k?si=1YU5gvYgjnXj547s" + videoId));
            startActivity(intent);
        }


    }
}