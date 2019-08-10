package com.isoguzay.androidnativematerialdesigndemo.mainactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.isoguzay.androidnativematerialdesigndemo.R;
import com.isoguzay.androidnativematerialdesigndemo.fabsample.FabActivity;
import com.isoguzay.androidnativematerialdesigndemo.floatinglabels.FloatingLabelsActivity;
import com.isoguzay.androidnativematerialdesigndemo.recyclerviewsample.RecyclerViewActivity;
import com.isoguzay.androidnativematerialdesigndemo.toolbarsample.ToolBarActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonFab, buttonFloating, buttonToolBar, buttonRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeComponents();
        buttonFabClick();
        buttonFloatingClick();
        buttonToolBarClick();
        buttonRecyclerViewClick();
    }


    public void buttonRecyclerViewClick(){
        buttonRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goRecycler = new Intent(getApplicationContext(), RecyclerViewActivity.class);
                startActivity(goRecycler);
            }
        });
    }

    public void buttonToolBarClick(){
        buttonToolBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToolBar = new Intent(getApplicationContext(), ToolBarActivity.class);
                startActivity(goToolBar);
            }
        });
    }

    public void buttonFloatingClick() {
        buttonFloating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goFloating = new Intent(getApplicationContext(), FloatingLabelsActivity.class);
                startActivity(goFloating);
            }
        });
    }

    public void buttonFabClick() {
        buttonFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goFab = new Intent(getApplicationContext(), FabActivity.class);
                startActivity(goFab);
            }
        });
    }

    public void initializeComponents() {
        buttonFab = findViewById(R.id.button_fabSample);
        buttonFloating = findViewById(R.id.button_floatingSample);
        buttonToolBar = findViewById(R.id.button_toolBar);
        buttonRecyclerView = findViewById(R.id.button_recyclerViewSample);

    }
}
