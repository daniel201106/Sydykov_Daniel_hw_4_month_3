package com.gekss.sydykov_daniel_hw_4_month_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gekss.sydykov_daniel_hw_4_month_3.continents.ContinentFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,new ContinentFragment()).commit();
    }
}