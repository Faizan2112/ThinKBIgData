package com.example.thinkbigdata.activities;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.thinkbigdata.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().hide();
        Toolbar toolbar = (Toolbar)findViewById(R.id.about_toolbar);
        toolbar.setTitle("About");
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.about_collapse);
        collapsingToolbarLayout.setTitle("About Us");

    }
}
