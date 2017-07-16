package com.example.thinkbigdata.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.thinkbigdata.R;

public class QueryPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query_page);
        getSupportActionBar().hide();
    }
}
