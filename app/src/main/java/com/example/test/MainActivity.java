package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
MediaPlayer song;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button act2_1 = (Button) findViewById(R.id.bt2_1);
        final Button act3_1= (Button) findViewById(R.id.bt3_1);
        final ImageView pic= (ImageView) findViewById(R.id.img1);

        act2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1tos2= new Intent(MainActivity.this,Activity2.class);
                startActivity(s1tos2);
            }
        });

        act3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x= new Intent(MainActivity.this,Activity3.class);
                startActivity(x);
            }
        });

        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song=MediaPlayer.create(MainActivity.this,R.raw.throughthevalley);
                song.start();
            }
        });

    }
}