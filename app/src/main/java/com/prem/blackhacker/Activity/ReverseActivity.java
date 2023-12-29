package com.prem.blackhacker.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.prem.blackhacker.Ads.Admob;
import com.prem.blackhacker.R;

public class ReverseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse);

        Admob.setBanner(findViewById(R.id.banner_ads), ReverseActivity.this);

        getSupportActionBar().setTitle("Reverse Engineering");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}