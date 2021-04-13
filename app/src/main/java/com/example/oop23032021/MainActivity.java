package com.example.oop23032021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //object dai dien cho 1 thuc the
        //class dai dien cho 1 quan the
        Animal meo = new Animal();
        meo.color ="xám";
        meo.name = " milo ";
        Log.d("BBB",meo.name);

    }
}