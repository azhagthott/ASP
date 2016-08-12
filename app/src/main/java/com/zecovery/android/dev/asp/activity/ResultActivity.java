package com.zecovery.android.dev.asp.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.zecovery.android.dev.asp.R;
import com.zecovery.android.dev.asp.adapter.AreaCardViewAdapter;
import com.zecovery.android.dev.asp.main.Area;

import java.util.ArrayList;
import java.util.List;

public class ResultActivity extends BaseActivity implements View.OnClickListener {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(new AreaCardViewAdapter(areaArrayList()));
    }

    @Override
    public void onClick(View view) {
    }

    private ArrayList<Area> areaArrayList() {

        ArrayList<Area> areas = new ArrayList<>();

        areas.add(new Area("Torres del Paine", R.drawable.torres_del_paine));
        areas.add(new Area("Caleta Tortel", R.drawable.caleta_tortel));
        areas.add(new Area("Carretera Austral", R.drawable.carretera_austral));
        areas.add(new Area("Laguna San Rafael", R.drawable.laguna_san_rafael));

        return areas;
    }
}
