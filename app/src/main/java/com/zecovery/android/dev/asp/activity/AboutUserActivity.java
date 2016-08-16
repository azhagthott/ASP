package com.zecovery.android.dev.asp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.zecovery.android.dev.asp.R;

public class AboutUserActivity extends BaseActivity implements View.OnClickListener {

    private Button buttonContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_user);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        buttonContinue = (Button) findViewById(R.id.buttonContinue);
        buttonContinue.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.buttonContinue:

                Intent intent = new Intent(AboutUserActivity.this, SearchActivity.class);

                View sharedView = buttonContinue;
                String transitionName = getString(R.string.about_user_transition_search_button);
                ActivityOptionsCompat options = ActivityOptionsCompat
                        .makeSceneTransitionAnimation(AboutUserActivity.this, sharedView, transitionName);
                ActivityCompat.startActivity(this, intent, options.toBundle());
                break;
        }
    }
}
