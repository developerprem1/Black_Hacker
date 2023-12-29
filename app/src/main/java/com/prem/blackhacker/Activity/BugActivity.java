package com.prem.blackhacker.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.prem.blackhacker.Ads.Admob;
import com.prem.blackhacker.R;


public class BugActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bug);

        Admob.setBanner(findViewById(R.id.banner_ads), BugActivity.this);

        getSupportActionBar().setTitle("Bug Bounty");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}