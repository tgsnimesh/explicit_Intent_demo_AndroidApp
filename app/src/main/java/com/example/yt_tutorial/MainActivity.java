package com.example.yt_tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eTextUserName, eTextPassword;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTextUserName = findViewById(R.id.userName);
        eTextPassword = findViewById(R.id.password);

        btnSubmit = findViewById(R.id.btnSubmit);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = eTextUserName.getText().toString();
                String password = eTextPassword.getText().toString();

                Intent activityTwo = new Intent(getApplicationContext(), activityTwo.class);
                activityTwo.putExtra("USER_NAME", userName);
                activityTwo.putExtra("USER_PASSWORD", password);
                startActivity(activityTwo);
            }
        });

    }

}