package com.trafficfloatwindow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.trafficfloatwindowlibrary.TrafficFloatWindowService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService(new Intent(this , TrafficFloatWindowService.class)) ;
    }
}
