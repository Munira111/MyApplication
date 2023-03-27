package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView msg;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        msg = findViewById(R.id.received_value_id);
        Intent i = getIntent();
        s = i.getStringExtra("message_key");
        msg.setText("Hello, "+ s +" !");


    }
}