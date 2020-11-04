package com.example.microproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void begi(View view){
        Intent i =new Intent(MainActivity.this,beginner.class);
        startActivity(i);
    }
    public void intr(View view){
        Intent i =new Intent(MainActivity.this,intermediate.class);
        startActivity(i);
    }
    public void adv(View view){
        Intent i =new Intent(MainActivity.this,advanced.class);
        startActivity(i);
    }
}
