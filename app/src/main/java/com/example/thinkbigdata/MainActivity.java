package com.example.thinkbigdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button lightOn ,lightOff ;
    String LIGHTONURL = "192.168.1.31:8080/?turn = on";
    String LIGHTOFFURL = "192.168.1.31:8080/?turn = off";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
/*
        lightOn = (Button)findViewById(R.id.light_on);
        lightOff = (Button)findViewById(R.id.light_off);
        lightOn.setOnClickListener(this);
        lightOff.setOnClickListener(this);
*/

    }

    @Override
    public void onClick(final View v) {
        int id = v.getId();
        switch(id)
        {
/*
                case R.id.light_on:
                StringRequest stringRequest = new StringRequest(Request.Method.GET, LIGHTONURL, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(getApplicationContext(),"Light on",Toast.LENGTH_LONG).show();
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });
                break;
            case R.id.light_off:
                StringRequest stringRequestOff = new StringRequest(Request.Method.GET, LIGHTOFFURL, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(getApplicationContext(),"Light off",Toast.LENGTH_LONG).show();
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });
                break;
*/



        }

    }}

