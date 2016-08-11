package com.zecovery.android.dev.asp.activity;

import android.content.Intent;
import android.os.Bundle;

import com.zecovery.android.dev.asp.R;
import com.zecovery.android.dev.asp.intro.IntroActivity;

public class LaunchScreenActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);

        Intent intent = new Intent(this, IntroActivity.class);
        startActivity(intent);
        finish();
    }
}
