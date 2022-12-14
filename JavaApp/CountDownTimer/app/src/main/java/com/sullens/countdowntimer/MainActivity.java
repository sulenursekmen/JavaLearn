package com.sullens.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView4=findViewById(R.id.textView);
        new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long l) {
                textView4.setText("Left:"+l/1000);



            }

            @Override
            public void onFinish() {
                Toast.makeText(getApplicationContext(),"Done",Toast.LENGTH_LONG).show();
                textView4.setText("Finished");

            }
        }.start();

    }
}