package com.example.bestbody;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    Button btn_open;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_open = (Button) findViewById(R.id.calimc);
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent va = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(va);

            }
        });

    }}