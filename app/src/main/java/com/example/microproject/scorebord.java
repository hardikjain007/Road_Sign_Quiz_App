package com.example.microproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class scorebord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorebord);


        Intent intent = getIntent();
       int s= intent.getIntExtra("score",0);

        TextView t=findViewById(R.id.scoreview);

        t.setText(String.valueOf(s)+"/10");
    }
}
