package com.prem.blackhacker.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.prem.blackhacker.Ads.Admob;
import com.prem.blackhacker.R;

public class CyberSecurityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cyber_security);

        Admob.setBanner(findViewById(R.id.banner_ads), CyberSecurityActivity.this);

        getSupportActionBar().setTitle("Cyber Security");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}