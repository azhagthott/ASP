package com.zecovery.android.dev.asp.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;
import com.zecovery.android.dev.asp.R;
import com.zecovery.android.dev.asp.activity.MainActivity;
import com.zecovery.android.dev.asp.main.Area;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by francisco on 11-08-16.
 */

public class AreaCardViewAdapter extends RecyclerView.Adapter<AreaCardViewHolder> {

    private List<Area> areas;
    private Context context;

    public AreaCardViewAdapter(List<Area> areas) {
        this.areas = new ArrayList<>();
        this.areas.addAll(areas);
    }

    @Override
    public AreaCardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_result, viewGroup, false);
        return new AreaCardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AreaCardViewHolder holder, int i) {

        Area area = areas.get(i);
        context = holder.imageViewArea.getContext();

        holder.textViewAreaName.setText(area.getAreaName());
        Picasso.with(context).load(area.getAreaPhoto()).into(holder.imageViewArea);

        holder.cardViewResult.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), MainActivity.class);

                Log.d(TAG, "onClick");

                intent.putExtra("ASP", "var_aps");
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return areas.size();
    }
}
