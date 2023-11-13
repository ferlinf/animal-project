package com.example.projectanimals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HiuActivity extends AppCompatActivity {
    ImageView arrowBackImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiu);

        arrowBackImageView = findViewById(R.id.arrowBackImageView);
        arrowBackImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to go back to HomeActivity
                Intent intent = new Intent(HiuActivity.this, HomeActivity.class);

                // Add flags to clear the back stack and start a new instance of HomeActivity
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);

                // Add an extra to indicate that you want to select the LautFragment
                intent.putExtra("SELECTED_TAB", "LautFragment");

                // Start the intent
                startActivity(intent);
            }
        });
    }

    public void videoHiu(View view) {
        String videoId = "https://youtu.be/DPnvwJUlZyk?si=tQUqewLcwJ7OqPCT";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube"+videoId));
        intent.putExtra("VIDEO_ID", videoId);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/DPnvwJUlZyk?si=tQUqewLcwJ7OqPCT" + videoId));
            startActivity(intent);
        }
    }
}