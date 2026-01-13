package com.example.hm2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnProfile).setOnClickListener(v ->
                startActivity(new Intent(this, activity_profile.class))
        );

        findViewById(R.id.btnOrders).setOnClickListener(v ->
                startActivity(new Intent(this, activity_orders.class))
        );
    }
}