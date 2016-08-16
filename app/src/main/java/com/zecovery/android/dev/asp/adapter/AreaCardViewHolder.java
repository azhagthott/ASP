package com.zecovery.android.dev.asp.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.zecovery.android.dev.asp.R;
import com.zecovery.android.dev.asp.activity.DetailedActivity;

import static com.zecovery.android.dev.asp.activity.BaseActivity.LOG_TAG;

/**
 * Created by francisco on 11-08-16.
 */

public class AreaCardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView textViewAreaName;
    public ImageView imageViewArea;
    public CardView cardViewResult;
    public Context context;

    public AreaCardViewHolder(View view) {
        super(view);

        cardViewResult = (CardView) view;
        textViewAreaName = (TextView) view.findViewById(R.id.textViewAreaName);
        imageViewArea = (ImageView) view.findViewById(R.id.imageViewMain);
        context = view.getContext();
        view.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Log.d(LOG_TAG, "onClick");

        final Intent intent;

        intent = new Intent(context, DetailedActivity.class);

        View sharedView = imageViewArea;
        String transitionName = context.getString(R.string.detail_transition_main_image);

        ActivityOptionsCompat options = ActivityOptionsCompat
                .makeSceneTransitionAnimation((Activity) context, sharedView, transitionName);

        context.startActivity(intent, options.toBundle());
    }
}
