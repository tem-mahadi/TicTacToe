package com.temmahadi.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Intent next = new Intent(SplashScreen.this,StartPage.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(next);
            }
        },3000);
    }
}