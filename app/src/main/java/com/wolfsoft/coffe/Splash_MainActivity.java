package com.wolfsoft.coffe;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash_MainActivity extends AppCompatActivity {
    private static int SPLAESH_TIME_OUT=2000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash_MainActivity.this,OnBoarding_MainActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLAESH_TIME_OUT);
    }

    }
