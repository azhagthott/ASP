package com.zecovery.android.dev.asp.activity;

import android.content.Intent;
import android.os.Bundle;

import com.zecovery.android.dev.asp.R;
import com.zecovery.android.dev.asp.intro.IntroActivity;

import java.util.Timer;
import java.util.TimerTask;

public class LaunchScreenActivity extends BaseActivity {

    private static final long SPLASH_SCREEN_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(LaunchScreenActivity.this, IntroActivity.class));
                finish();
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, SPLASH_SCREEN_DELAY);
    }
}