package com.example.thinkbigdata.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.thinkbigdata.R;

public class IntroductionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_introduction);
    }
}
