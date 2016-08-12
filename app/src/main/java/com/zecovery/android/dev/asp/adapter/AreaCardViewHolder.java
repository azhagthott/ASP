package com.zecovery.android.dev.asp.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.zecovery.android.dev.asp.R;

/**
 * Created by francisco on 11-08-16.
 */

public class AreaCardViewHolder extends RecyclerView.ViewHolder {

    public TextView textViewAreaName;
    public ImageView imageViewArea;
    public CardView cardViewResult;

    public AreaCardViewHolder(View view) {
        super(view);

        cardViewResult = (CardView) view.findViewById(R.id.cardViewResult);
        textViewAreaName = (TextView) view.findViewById(R.id.textViewAreaName);
        imageViewArea = (ImageView) view.findViewById(R.id.imageViewArea);
    }
}
