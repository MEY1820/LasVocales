package com.example.lasvocales;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    Button btnvocalA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnvocalA=(Button) findViewById(R.id.btnvocalA);
        mp=MediaPlayer.create(this, R.raw.vocal_a);
        btnvocalA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
        MediaPlayer mpE;
        Button btnvocalE;
        btnvocalE = (Button) findViewById(R.id.btnvocalE);
        mpE=MediaPlayer.create(this, R.raw.vocal_e);
        btnvocalE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpE.start();
            }
        });

        MediaPlayer mpI;
        Button btnvocalI;
        btnvocalI = (Button) findViewById(R.id.btnvocalI);
        mpI=MediaPlayer.create(this, R.raw.vocal_i);
        btnvocalI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpI.start();
            }
        });

        MediaPlayer mpO;
        Button btnvocalO;
        btnvocalO = (Button) findViewById(R.id.btnvocalO);
        mpO=MediaPlayer.create(this, R.raw.vocal_o);
        btnvocalO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpO.start();
            }
        });

        MediaPlayer mpU;
        Button btnvocalU;
        btnvocalU = (Button) findViewById(R.id.btnvocalU);
        mpU=MediaPlayer.create(this, R.raw.vocal_u);
        btnvocalU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpU.start();
            }
        });


    }
}