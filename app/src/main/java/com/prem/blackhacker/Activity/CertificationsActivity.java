package com.prem.blackhacker.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.prem.blackhacker.Ads.Admob;
import com.prem.blackhacker.R;


public class CertificationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certifications);

        Admob.setBanner(findViewById(R.id.banner_ads), CertificationsActivity.this);

        getSupportActionBar().setTitle("Certifications");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}