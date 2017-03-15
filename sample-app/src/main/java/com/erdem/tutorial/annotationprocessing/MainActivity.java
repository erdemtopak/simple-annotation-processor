package com.erdem.tutorial.annotationprocessing;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.erdem.tutorial.randomizer.RandomInt;
import com.erdem.tutorial.randomizer.RandomString;

public class MainActivity extends BaseActivity {

    @RandomString
    String test1;

    @RandomString
    String test2;

    @RandomInt
    int test3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("#MainActivity#", "test2 = " + test1);
        Log.d("#MainActivity#", "test3 = " + test2);
        Log.d("#MainActivity#", "test4 = " + test3);

        Button button = ((Button) findViewById(R.id.second_activity_button));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(SecondActivity.newIntent(MainActivity.this));
            }
        });
    }
}
