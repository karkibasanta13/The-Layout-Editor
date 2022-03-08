package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button clickButton;
    private Button toastButton;
    private Button resetButton;
    private TextView textView;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickButton = findViewById(R.id.button_count);
        toastButton = findViewById(R.id.button_toast);
        resetButton = findViewById(R.id.button_reset);
        textView = findViewById(R.id.show_count);




        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textView.setText(""+ count);

                if((count % 2) ==0){
                    resetButton.setBackgroundColor(Color.BLACK);
                }
                if((count % 2) !=0)
                {
                    resetButton.setBackgroundColor(Color.RED);
                }
            }

        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("0");
                count = 0;

             resetButton.setBackgroundColor(Color.GRAY);
            }
        });

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This is simple toast", Toast.LENGTH_SHORT).show();
            }
        });






    }
}