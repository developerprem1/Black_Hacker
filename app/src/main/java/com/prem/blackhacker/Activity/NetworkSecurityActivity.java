package com.prem.blackhacker.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.prem.blackhacker.Ads.Admob;
import com.prem.blackhacker.R;

public class NetworkSecurityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network_security);

        Admob.setBanner(findViewById(R.id.banner_ads), NetworkSecurityActivity.this);

        getSupportActionBar().setTitle("Network Security");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}