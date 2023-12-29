package com.prem.blackhacker.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.prem.blackhacker.Ads.Admob;
import com.prem.blackhacker.R;

public class FirewallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firewall);

        Admob.setBanner(findViewById(R.id.banner_ads), FirewallActivity.this);

        getSupportActionBar().setTitle("Firewall");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}