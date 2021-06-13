package com.example.bmi2;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class bmi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        Widget();





        calculateBmiButton.setOnClickListener(calculateBmiButtonListener);

    }

    private TextView bmiTextView;//show the calculated BMR

    private Button calculateBmiButton;

    private void calculate() {
        double bmi = ( (double) profile.weight / ( (double) profile.height * (double) profile.height)) * 703;
        Log.d("MI","bmi=" + bmi);
        bmiTextView.setText(String.format("%.02f", bmi));
    }

    private View.OnClickListener calculateBmiButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            calculate();
        }
    };
    private void Widget(){
        bmiTextView=(TextView) findViewById(R.id.bmiTextView);
        calculateBmiButton=(Button) findViewById(R.id.calculateBmiButton);

    }
}
