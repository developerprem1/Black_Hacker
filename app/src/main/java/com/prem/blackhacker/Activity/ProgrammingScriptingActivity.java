package com.prem.blackhacker.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.prem.blackhacker.Ads.Admob;
import com.prem.blackhacker.R;

public class ProgrammingScriptingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming_scripting);

        Admob.setBanner(findViewById(R.id.banner_ads), ProgrammingScriptingActivity.this);

        getSupportActionBar().setTitle("Programming & Scripting");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}