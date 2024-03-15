package com.temmahadi.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,btnN;
    String bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, btN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnN = findViewById(R.id.btnN);
    }

    public void blank(View view){
        Button curr = (Button) view;
        int t=3000;
        if(curr==btnN) {
            t=1000;
            btnN.setText("None");
        }
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                btnN.setText("New Game");
                flag=count=0;
            }
        },t);
            btnN.setText(curr.getText().toString()+" was Smart");

    }

    int flag = 0, count = 0;

    public void check(View view) {
        Button curr = (Button) view;
        count++;
        btnN.setText("Destroy");

        if(curr == btnN){
            blank(btnN);
            return;
        }

        if (flag == 0) {
            curr.setText("X");
            flag = 1;
        } else {
            curr.setText("O");
            flag = 0;
        }

        if (count > 4) {
            bt1 = btn1.getText().toString();
            bt2 = btn2.getText().toString();
            bt3 = btn3.getText().toString();
            bt4 = btn4.getText().toString();
            bt5 = btn5.getText().toString();
            bt6 = btn6.getText().toString();
            bt7 = btn7.getText().toString();
            bt8 = btn8.getText().toString();
            bt9 = btn9.getText().toString();
            btN = btnN.getText().toString();

            if (bt1.equals(bt2) && bt2.equals(bt3) && !bt1.equals("")) {
                Toast.makeText(this, "Winner is " + bt1, Toast.LENGTH_SHORT).show();
                blank(btn1);

            } else if (bt4.equals(bt5) && bt5.equals(bt6) && !bt6.equals("")) {
                Toast.makeText(this, "Winner is " + bt4, Toast.LENGTH_SHORT).show();
                blank(btn4);

            } else if (bt7.equals(bt8) && bt8.equals(bt9) && !bt9.equals("")) {
                Toast.makeText(this, "Winner is " + bt9, Toast.LENGTH_SHORT).show();
                blank(btn7);

            } else if (bt1.equals(bt4) && bt4.equals(bt7) && !bt1.equals("")) {
                Toast.makeText(this, "Winner is " + bt1, Toast.LENGTH_SHORT).show();
                blank(btn1);

            } else if (bt2.equals(bt5) && bt2.equals(bt8) && !bt2.equals("")) {
                Toast.makeText(this, "Winner is " + bt2, Toast.LENGTH_SHORT).show();
                blank(btn2);

            } else if (bt3.equals(bt6) && bt6.equals(bt9) && !bt9.equals("")) {
                Toast.makeText(this, "Winner is " + bt9, Toast.LENGTH_SHORT).show();
                blank(btn3);

            } else if (bt1.equals(bt5) && bt5.equals(bt9) && !bt1.equals("")) {
                Toast.makeText(this, "Winner is " + bt1, Toast.LENGTH_SHORT).show();
                blank(btn1);

            } else if (bt3.equals(bt5) && bt5.equals(bt7) && !bt3.equals("")) {
                Toast.makeText(this, "Winner is " + bt3, Toast.LENGTH_SHORT).show();
                blank(btn3);
            } else if (count == 9) {
                Toast.makeText(this, "Match Drawn", Toast.LENGTH_SHORT).show();
                blank(btnN);
            }

        }
    }
}