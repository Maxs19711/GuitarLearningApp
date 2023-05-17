package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity4.class);
                startActivity(intent);
            }
        });
       //page2.putExtra;
        Button a1 = (Button) findViewById(R.id.button6);
        Button a2 = (Button) findViewById(R.id.button5);
        Button a3 = (Button) findViewById(R.id.button4);
        Button a4 = (Button) findViewById(R.id.button7);
        Button a5 = (Button) findViewById(R.id.button8);
        Button a6 = (Button) findViewById(R.id.button9);

        MediaPlayer m1 = MediaPlayer.create(this,R.raw.a);
        MediaPlayer m2 = MediaPlayer.create(this,R.raw.b);
        MediaPlayer m3 = MediaPlayer.create(this,R.raw.c);
        MediaPlayer m4 = MediaPlayer.create(this,R.raw.d);
        MediaPlayer m5 = MediaPlayer.create(this,R.raw.e);
        MediaPlayer m6 = MediaPlayer.create(this,R.raw.f);

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m3.start();
            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m2.start();
            }
        });

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m1.start();
            }
        });

        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m4.start();
            }
        });

        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m5.start();
            }
        });

        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m6.start();
            }
        });



    }
}