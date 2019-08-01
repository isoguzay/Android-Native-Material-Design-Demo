package com.isoguzay.androidnativematerialdesigndemo.toolbarsample;

import android.graphics.Color;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.isoguzay.androidnativematerialdesigndemo.R;

public class ToolBarActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_bar);
        initializeComponents();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        MenuItem item = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(item);
        searchView.setOnQueryTextListener(ToolBarActivity.this);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_add:
                Toast.makeText(getApplicationContext(), "Added", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_update:
                Toast.makeText(getApplicationContext(),"Updated", Toast.LENGTH_LONG).show();
                return true;
                default:
                    return super.onOptionsItemSelected(item);

        }
    }

    public void initializeComponents(){
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Hello World");
        toolbar.setSubtitle("Howdy !");
        toolbar.setLogo(R.drawable.ic_flag_black_24dp);
        toolbar.setSubtitleTextColor(Color.RED);
        toolbar.setBackgroundColor(Color.BLACK);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        Log.e("TextSubmit", query);
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        Log.e("TextChange", newText);
        return false;
    }
}
