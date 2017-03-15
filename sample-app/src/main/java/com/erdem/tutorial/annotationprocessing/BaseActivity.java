package com.erdem.tutorial.annotationprocessing;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.erdem.tutorial.randomizer.Randomizer;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Randomizer.bind(this);
    }
}
