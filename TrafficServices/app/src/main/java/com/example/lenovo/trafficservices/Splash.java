package com.example.lenovo.trafficservices;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends FragmentActivity {

    private static final long SPLASH_TIME=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                Intent mainIntent=new Intent().setClass(Splash.this,LoginActivity.class);
                startActivity(mainIntent);
                finish();
            }
        };
        Timer timer=new Timer();
        timer.schedule(task,SPLASH_TIME);
    }
}
