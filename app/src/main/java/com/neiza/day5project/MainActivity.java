package com.neiza.day5project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Handler handler;

    String user = "MoneiBK";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView logo_id = (ImageView) findViewById(R.id.logo_id);
        TextView textViewLogo = (TextView) findViewById(R.id.textViewLogo);

        Toast.makeText(MainActivity.this, "Welcome to my HangMan Game " + user, Toast.LENGTH_SHORT).show();
        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this, secondLayout.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}