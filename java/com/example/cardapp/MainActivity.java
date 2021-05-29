package com.example.cardapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView card1 ,card2,card3,card4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        card1 = findViewById(R.id.Card1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Growth", Toast.LENGTH_SHORT).show();
                gen_syllabus();
            }
        });


    }

    public void gen_syllabus()
    {
        Intent i = new Intent(this,growth_activity.class);
        startActivity(i);
    }
}