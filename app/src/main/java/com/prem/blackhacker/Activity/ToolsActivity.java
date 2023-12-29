package com.prem.blackhacker.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.prem.blackhacker.Ads.Admob;
import com.prem.blackhacker.R;

public class ToolsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);

        Admob.setBanner(findViewById(R.id.banner_ads), ToolsActivity.this);

        getSupportActionBar().setTitle("Tools");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}