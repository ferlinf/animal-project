package com.example.projectanimals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class KoalaActivity extends AppCompatActivity {
    ImageView arrowBackImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koala);

        ImageView arrowBackImageView = findViewById(R.id.arrowBackImageView);
        arrowBackImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KoalaActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    public void videoKoala(View view) {
        String videoId = "https://youtu.be/oI3ADcDH0Uc?si=xt5_KKUvcTW4ltPl";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube" + videoId));
        intent.putExtra("VIDEO_ID", videoId);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/oI3ADcDH0Uc?si=xt5_KKUvcTW4ltPl" + videoId));
            startActivity(intent);
        }
    }
}