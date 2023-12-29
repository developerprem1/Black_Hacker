package com.prem.blackhacker.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.prem.blackhacker.Ads.Admob;
import com.prem.blackhacker.R;

public class ExperienceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);

        Admob.setBanner(findViewById(R.id.banner_ads), ExperienceActivity.this);

        getSupportActionBar().setTitle("Buffer Overflow");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}