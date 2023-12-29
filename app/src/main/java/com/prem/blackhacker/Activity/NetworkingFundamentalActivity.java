package com.prem.blackhacker.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.prem.blackhacker.Ads.Admob;
import com.prem.blackhacker.R;


public class NetworkingFundamentalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_networking_fundamental);

        Admob.setBanner(findViewById(R.id.banner_ads), NetworkingFundamentalActivity.this);

        getSupportActionBar().setTitle("Network Fun");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}