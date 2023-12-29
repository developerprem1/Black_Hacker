package com.prem.blackhacker.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.prem.blackhacker.Ads.Admob;
import com.prem.blackhacker.R;

public class InformationGathActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_gath);

        Admob.setBanner(findViewById(R.id.banner_ads), InformationGathActivity.this);

        getSupportActionBar().setTitle("Info Gathering");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}