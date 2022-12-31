package com.example.m3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.main_button);
    }
    public void buttonClick(View view) {
        //change the button content to "Oh, yea, I've been clicked!"
        btn.setText("Oh, yea, I’ve been clicked!");
    }
}