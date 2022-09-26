package com.example.c2_p29;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText food1, food2, food3, food4;
    private Button submit;
    private TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        food1 = findViewById(R.id.food1);
        food2 = findViewById(R.id.food2);
        food3 = findViewById(R.id.food3);
        food4 = findViewById(R.id.food4);
        total = findViewById(R.id.total);

        submit = findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(food1.getText().toString())*200 +
                        Integer.parseInt(food2.getText().toString())*360 +
                        Integer.parseInt(food3.getText().toString())*700 +
                        Integer.parseInt(food4.getText().toString())*240;
                total.setText("Total Calories: " + n);
            }
        });
    }
}