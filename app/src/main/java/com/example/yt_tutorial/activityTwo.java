package com.example.yt_tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class activityTwo extends AppCompatActivity {

    EditText eTextUserName, eTextPassword;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        eTextUserName = findViewById(R.id.userName);
        eTextPassword = findViewById(R.id.password);

        btnBack = findViewById(R.id.btnBack);

        Intent mainActivityIntent = getIntent();

        String userName =  mainActivityIntent.getStringExtra("USER_NAME");
        String password =  mainActivityIntent.getStringExtra("USER_PASSWORD");

        eTextUserName.setText(userName);
        eTextPassword.setText(password);

    }
}