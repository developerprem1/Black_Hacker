package com.prem.blackhacker.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.prem.blackhacker.Ads.Admob;
import com.prem.blackhacker.R;

public class SocialEngiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_engi);

        Admob.setBanner(findViewById(R.id.banner_ads), SocialEngiActivity.this);

        getSupportActionBar().setTitle("Social Engineering");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}