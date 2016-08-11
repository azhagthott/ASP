package com.zecovery.android.dev.asp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.zecovery.android.dev.asp.R;

public class ResultActivity extends BaseActivity implements View.OnClickListener{

    private ImageView image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        image1 = (ImageView) findViewById(R.id.image1);

        image1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.image1:
                startActivity(new Intent(ResultActivity.this, DetailedActivity.class));
        }
    }
}
