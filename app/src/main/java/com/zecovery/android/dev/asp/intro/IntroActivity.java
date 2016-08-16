package com.zecovery.android.dev.asp.intro;

import android.Manifest;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;
import com.zecovery.android.dev.asp.activity.AboutUserActivity;

public class IntroActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(new IntroFragment1());
        addSlide(new IntroFragment2());
        addSlide(new IntroFragment3());
        addSlide(new IntroFragment4());

        showSkipButton(false);
        showStatusBar(false);
        setProgressButtonEnabled(true);
        setFadeAnimation();
    }

    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            askForPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 2);
        }
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        startActivity(new Intent(IntroActivity.this, AboutUserActivity.class));
        finish();
    }

}
