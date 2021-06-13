package com.example.bmi2;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Widget();


        profileButton.setOnClickListener(profileButtonListener);
    }

    private Button profileButton;//will launch profile activity

    private View.OnClickListener profileButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(MainActivity.this, profile.class));

        }
    };
    private void Widget(){
        profileButton=(Button) findViewById(R.id.profileButton);
    }
}