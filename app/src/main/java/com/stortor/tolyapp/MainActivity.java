package com.stortor.tolyapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.bottom1);
        button1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        });
        button2 = (Button) findViewById(R.id.bottom4);
        button2.setOnClickListener(view ->{
            Intent intent = new Intent(MainActivity.this,MainActivity3.class);
            startActivity(intent);
        } );
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(view ->{
            Intent intent = new Intent(MainActivity.this,MainActivity4.class);
            startActivity(intent);
        } );

    }
}