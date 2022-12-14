package com.sullens.methodsandclasses;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    String username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testMethod();
        username="James";
    }

    public void makeMusicians(){
        Musicians james=new Musicians("James","Guitar",50);
        //james.age=50;
        //james.instrument="Guitar";
        //james.name="James";

    }

    public void testMethod(){
        int x=4+4;
        System.out.println(x);
        username="Lars";
    }


    @Override
    protected void onResume() {
        super.onResume();
        username="Kirk";
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}