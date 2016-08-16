package com.zecovery.android.dev.asp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;
import com.zecovery.android.dev.asp.R;
import com.zecovery.android.dev.asp.main.Area;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by francisco on 11-08-16.
 */

public class AreaCardViewAdapter extends RecyclerView.Adapter<AreaCardViewHolder> {

    private List<Area> areas;

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
    public void onBindViewHolder(final AreaCardViewHolder holder, int i) {

        Context context = holder.imageViewArea.getContext();

        Area area = areas.get(i);
        holder.textViewAreaName.setText(area.getAreaName());
        Picasso.with(context).load(area.getAreaPhoto()).into(holder.imageViewArea);
    }

    @Override
    public int getItemCount() {
        return areas.size();
    }
}
