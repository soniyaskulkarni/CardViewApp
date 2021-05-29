package com.example.cardapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class growth_activity extends AppCompatActivity {

    ListView lst2;
    ImageButton imb;
     TextView txv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

      lst2 = findViewById(R.id.growth_lst);
      imb = findViewById(R.id.img_back);
      txv = findViewById(R.id.growth_txt);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.growth);
        Intent it=getIntent();

    }
}
