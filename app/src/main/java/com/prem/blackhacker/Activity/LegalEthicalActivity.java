package com.prem.blackhacker.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.prem.blackhacker.Ads.Admob;
import com.prem.blackhacker.R;


public class LegalEthicalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legal_ethical);

        Admob.setBanner(findViewById(R.id.banner_ads), LegalEthicalActivity.this);

        getSupportActionBar().setTitle("Legal Ethical");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}