package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class Image extends AppCompatActivity {
MediaPlayer song;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        song = new MediaPlayer();

        song = MediaPlayer.create(this, R.raw.throughthevalley);
        song.start();
    }
}