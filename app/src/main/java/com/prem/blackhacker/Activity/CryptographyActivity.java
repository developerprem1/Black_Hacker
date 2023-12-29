package com.prem.blackhacker.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.prem.blackhacker.Ads.Admob;
import com.prem.blackhacker.R;

public class CryptographyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cryptography);

        Admob.setBanner(findViewById(R.id.banner_ads), CryptographyActivity.this);

        getSupportActionBar().setTitle("Cryptography");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}