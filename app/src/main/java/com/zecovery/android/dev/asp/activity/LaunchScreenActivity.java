package com.zecovery.android.dev.asp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

import com.zecovery.android.dev.asp.R;
import com.zecovery.android.dev.asp.intro.IntroActivity;

import java.util.concurrent.TimeUnit;

public class LaunchScreenActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);

        //FIXME: aqui hacer que se cargue lo del inicio, eliminar los 3 segundos fijos
        SystemClock.sleep(TimeUnit.SECONDS.toMillis(3));

        Intent intent = new Intent(this, IntroActivity.class);
        startActivity(intent);
        finish();
    }
}