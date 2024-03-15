package com.temmahadi.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

@SuppressLint("CustomSplashScreen")
public class SplashScreen extends AppCompatActivity {
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Intent nex = new Intent(SplashScreen.this,StartPage.class);
        Animation start= AnimationUtils.loadAnimation(this,R.anim.starting);
        t=findViewById(R.id.start);
        t.setAnimation(start);
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