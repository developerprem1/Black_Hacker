package com.prem.blackhacker.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.prem.blackhacker.Ads.Admob;
import com.prem.blackhacker.R;

public class ForensicsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forensics);

        Admob.setBanner(findViewById(R.id.banner_ads), ForensicsActivity.this);

        getSupportActionBar().setTitle("Forensics");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}