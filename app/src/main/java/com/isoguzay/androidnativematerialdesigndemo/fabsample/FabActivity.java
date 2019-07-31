package com.isoguzay.androidnativematerialdesigndemo.fabsample;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.isoguzay.androidnativematerialdesigndemo.R;

public class FabActivity extends AppCompatActivity {

    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab);

        initializeComponents();
        floatingActionButtonClick();
    }

    public void floatingActionButtonClick(){
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "File Uploading...", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void initializeComponents(){
        floatingActionButton = findViewById(R.id.floatingActionButton);
    }
}
