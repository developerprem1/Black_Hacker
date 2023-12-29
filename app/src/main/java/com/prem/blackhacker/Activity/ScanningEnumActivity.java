package com.prem.blackhacker.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.prem.blackhacker.Ads.Admob;
import com.prem.blackhacker.R;

public class ScanningEnumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanning_enum);

        Admob.setBanner(findViewById(R.id.banner_ads), ScanningEnumActivity.this);

        getSupportActionBar().setTitle("Scanning Enum");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}