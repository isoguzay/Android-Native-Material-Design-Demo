package com.isoguzay.androidnativematerialdesigndemo.floatinglabels;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.isoguzay.androidnativematerialdesigndemo.R;

public class FloatingLabelsActivity extends AppCompatActivity {

    private Button buttonLogin;
    private EditText editTextUsername, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_labels);

        initializeComponents();
        buttonLoginClick();
    }

    public void buttonLoginClick() {
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), editTextUsername.getText() + " " + editTextPassword.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void initializeComponents() {
        buttonLogin = findViewById(R.id.button_login);
        editTextPassword = findViewById(R.id.text_password);
        editTextUsername = findViewById(R.id.text_username);
    }
}
