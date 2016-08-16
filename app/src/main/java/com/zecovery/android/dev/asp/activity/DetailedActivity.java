package com.zecovery.android.dev.asp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.zecovery.android.dev.asp.R;

public class DetailedActivity extends BaseActivity {

    private ImageView imageViewMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imageViewMain = (ImageView) findViewById(R.id.imageViewMain);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Intent intent = new Intent(DetailedActivity.this, MainActivity.class);

                View sharedView = imageViewMain;
                String transitionName = getString(R.string.detail_transition_main_image);

                ActivityOptionsCompat transitionActivityOptions =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(DetailedActivity.this, sharedView, transitionName);
                startActivity(intent, transitionActivityOptions.toBundle());

            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
