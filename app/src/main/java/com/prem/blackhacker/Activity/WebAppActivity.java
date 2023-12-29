package com.prem.blackhacker.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.prem.blackhacker.Ads.Admob;
import com.prem.blackhacker.R;

public class WebAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_app);

        Admob.setBanner(findViewById(R.id.banner_ads), WebAppActivity.this);

        getSupportActionBar().setTitle("Web App");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}