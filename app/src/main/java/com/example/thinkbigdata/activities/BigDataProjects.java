package com.example.thinkbigdata.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.example.thinkbigdata.Main2Activity;
import com.example.thinkbigdata.R;

import static android.support.v7.appcompat.R.styleable.MenuItem;

public class BigDataProjects extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_data_projects);
        //getSupportActionBar().hide();

        final LinearLayout pro_one = (LinearLayout)findViewById(R.id.big_data_ll_light_project);
        pro_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent proIntent = new Intent(BigDataProjects.this, Main2Activity.class);
                startActivity(proIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }
    public boolean onOptionsItemSelected(android.view.MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.home:
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                this.startActivity(intent);
                //Toast.makeText(getApplicationContext(),"Item 1 Selected",Toast.LENGTH_LONG).show();
                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return true ;
    }
}
