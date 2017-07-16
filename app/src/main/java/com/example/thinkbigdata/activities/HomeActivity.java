package com.example.thinkbigdata.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.thinkbigdata.R;

public class HomeActivity extends AppCompatActivity implements ViewGroup.OnClickListener {
LinearLayout mBigData,mIOT,mIntro,mAbout,mUpdates,mQuery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();
        Toolbar toolbar = (Toolbar)findViewById(R.id.home_toolbar);
        toolbar.setTitle("Home");

        mBigData = (LinearLayout)findViewById(R.id.home_ll_big_data);
        mIOT = (LinearLayout)findViewById(R.id.home_ll_iot);
        mIntro = (LinearLayout)findViewById(R.id.home_ll_intro);
        mAbout = (LinearLayout)findViewById(R.id.home_ll_about);
        mUpdates = (LinearLayout)findViewById(R.id.home_ll_updates);
        mQuery = (LinearLayout)findViewById(R.id.home_ll_query);


        LinearLayout app_layer = (LinearLayout) findViewById (R.id.home_ll_big_data);
        app_layer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBigData = new Intent(HomeActivity.this,BigProjectActivity.class);
                startActivity(intentBigData);
            }
        });
        LinearLayout bigData = (LinearLayout) findViewById (R.id.home_ll_big_data);
        bigData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBigData = new Intent(HomeActivity.this,BigDataProjects.class);
                startActivity(intentBigData);
            }
        });
        LinearLayout iot = (LinearLayout) findViewById (R.id.home_ll_iot);
        iot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,BigProjectActivity.class);
                startActivity(intent);
            }
        });
        LinearLayout about = (LinearLayout) findViewById (R.id.home_ll_about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAbout = new Intent(HomeActivity.this,AboutActivity.class);
                startActivity(intentAbout);
            }
        });
        LinearLayout introduction = (LinearLayout) findViewById (R.id.home_ll_intro);
        introduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentIntroduction = new Intent(HomeActivity.this,IntroductionActivity.class);
                startActivity(intentIntroduction);
            }
        });
        LinearLayout update = (LinearLayout) findViewById (R.id.home_ll_updates);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentUpdates = new Intent(HomeActivity.this,UpdatesActivity.class);
                startActivity(intentUpdates);
            }
        });
        LinearLayout query  = (LinearLayout) findViewById (R.id.home_ll_query);
        query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentQuery = new Intent(HomeActivity.this,QueryPage.class);
                startActivity(intentQuery);
            }
        });
    }

public void onBigData()
    {
        Intent intentBigData = new Intent(HomeActivity.this,BigDataProjects.class);
        startActivity(intentBigData);
    }




  /*  app_layer.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(this, "hello", Toast.LENGTH_LONG).show();
        }
    });
*/
    public void onClick(View v) {
        int id = v.getId();
        switch (id)
        {
            case R.id.home_ac_bigdata:
                Intent intentBigData = new Intent(HomeActivity.this,BigDataProjects.class);
                startActivity(intentBigData);
                break;
            case R.id.home_ll_iot:
                Intent intent = new Intent(HomeActivity.this,IOTProjects.class);
                startActivity(intent);
                break;
            case R.id.home_ll_intro:
                Intent intentIntroduction = new Intent(HomeActivity.this,IntroductionActivity.class);
                startActivity(intentIntroduction);
                break;
            case R.id.home_ll_about:
                Intent intentAbout = new Intent(HomeActivity.this,AboutActivity.class);
                startActivity(intentAbout);
                break;
            case R.id.home_ll_updates:
                Intent intentUpdates = new Intent(HomeActivity.this,UpdatesActivity.class);
                startActivity(intentUpdates);
                break;
            case R.id.home_ll_query:
                Intent intentQuery = new Intent(HomeActivity.this,QueryPage.class);
                startActivity(intentQuery);
                break;



        }

    }
}
