package com.isoguzay.androidnativematerialdesigndemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.isoguzay.androidnativematerialdesigndemo.fabsample.FabActivity;
import com.isoguzay.androidnativematerialdesigndemo.floatinglabels.FloatingLabelsActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonFab, buttonFloating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeComponents();
        buttonFabClick();
        buttonFloatingClick();

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
    }
}
