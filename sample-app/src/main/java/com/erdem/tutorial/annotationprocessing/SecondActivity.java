package com.erdem.tutorial.annotationprocessing;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.erdem.tutorial.randomizer.RandomInt;
import com.erdem.tutorial.randomizer.RandomString;

public class SecondActivity extends BaseActivity {

    @RandomString
    String test1;

    @RandomInt(maxValue = 10)
    int test2;

    @RandomInt(minValue = 100, maxValue = 105)
    int test3;

    @RandomInt(minValue = 500, maxValue = 1000)
    int test4;

    @RandomInt(minValue = 100, maxValue = 101)
    int test5;

    @RandomInt
    int test6;

    @RandomString
    String test7;

    @RandomString
    String test8;



    public static Intent newIntent(Context context) {
        return new Intent(context, SecondActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("#SecondActivity#", "test1 = " + test1);
        Log.d("#SecondActivity#", "test2 = " + test2);
        Log.d("#SecondActivity#", "test3 = " + test3);
        Log.d("#SecondActivity#", "test4 = " + test4);
        Log.d("#SecondActivity#", "test5 = " + test5);
        Log.d("#SecondActivity#", "test6 = " + test6);
        Log.d("#SecondActivity#", "test7 = " + test7);
        Log.d("#SecondActivity#", "test8 = " + test8);
    }
}
