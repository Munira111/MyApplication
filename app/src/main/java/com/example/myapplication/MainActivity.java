package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Sbutton;
    TextView Stext;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Sbutton = findViewById(R.id.send_button_id);
        Stext = findViewById(R.id.send_text_id);

        Sbutton.setOnClickListener(view -> {

//                                           Intent intent =  new Intent(getApplicationContext() , MainActivity2.class);
            Intent intent = new Intent(MainActivity.this , MainActivity2.class);
            s = Stext.getText().toString();
            intent.putExtra("message_key",s);
            startActivity(intent);
            finish();

        });

    }
}