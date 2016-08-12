package com.zecovery.android.dev.asp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.zecovery.android.dev.asp.R;

public class AboutUserActivity extends BaseActivity implements View.OnClickListener {

    private Button buttonAboutUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_user);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        buttonAboutUser = (Button) findViewById(R.id.buttonAboutUser);
        buttonAboutUser.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.buttonAboutUser:
                startActivity(new Intent(AboutUserActivity.this, SearchActivity.class));
                break;
        }

    }
}
