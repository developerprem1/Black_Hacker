package com.prem.blackhacker.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.prem.blackhacker.Ads.Admob;
import com.prem.blackhacker.R;

public class OperatingSystemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operating_system);

        Admob.setBanner(findViewById(R.id.banner_ads), OperatingSystemActivity.this);

        getSupportActionBar().setTitle("Operating System");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}