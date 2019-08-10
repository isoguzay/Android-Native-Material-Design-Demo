package com.isoguzay.androidnativematerialdesigndemo.recyclerviewsample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.isoguzay.androidnativematerialdesigndemo.R;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyler_view);
        initializeComponents();
    }

    public void initializeComponents() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        /* Implement with that spec like instagram stories designs */
        //recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Izmir");
        cities.add("Berlin");

        adapter = new RecyclerViewAdapter(this, cities);

        recyclerView.setAdapter(adapter);
    }
}
