package com.example.projectanimals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NemoActivity extends AppCompatActivity {
    ImageView arrowBackImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nemo);

        ImageView arrowBackImageView = findViewById(R.id.arrowBackImageView);
        arrowBackImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NemoActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });
    }

    public void videoNemo(View view) {
        String videoId = "https://youtu.be/rn6R4ncd2OU?si=CMA58HJ_2pHP0rjA";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube"+videoId));
        intent.putExtra("VIDEO_ID", videoId);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/rn6R4ncd2OU?si=CMA58HJ_2pHP0rjA" + videoId));
            startActivity(intent);
        }
    }
}