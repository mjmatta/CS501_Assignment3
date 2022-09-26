package com.example.c2_p23;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView label;
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        label = findViewById(R.id.textView);
        b = findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(label.getText().toString().equals("GREEN")) {
                    label.setText("YELLOW");
                    label.setTextColor(Color.parseColor("#FFFF00"));
                } else if (label.getText().toString().equals("RED")) {
                    label.setText("GREEN");
                    label.setTextColor(Color.parseColor("#00FF00"));
                } else {
                    label.setText("RED");
                    label.setTextColor(Color.parseColor("#FF0000"));
                }
            }
        });
    }
}