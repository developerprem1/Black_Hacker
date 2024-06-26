package com.prem.blackhacker.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.prem.blackhacker.Ads.Admob;
import com.prem.blackhacker.R;

public class WirelessSecurityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wireless_security);

        Admob.setBanner(findViewById(R.id.banner_ads), WirelessSecurityActivity.this);

        getSupportActionBar().setTitle("Wireless Security");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}