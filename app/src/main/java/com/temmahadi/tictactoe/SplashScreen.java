package com.temmahadi.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

@SuppressLint("CustomSplashScreen")
public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Intent nex = new Intent(SplashScreen.this,StartPage.class);
        //parallel Thread
        new Handler().postDelayed(new Runnable() { //delay 3s before running run() method
            @Override
            public void run() {
                startActivity(nex);
                finish();
            }
        },3000);
    }
}