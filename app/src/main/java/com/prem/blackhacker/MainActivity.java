package com.prem.blackhacker;

import static android.Manifest.permission.POST_NOTIFICATIONS;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
import com.prem.blackhacker.Activity.BufferActivity;
import com.prem.blackhacker.Activity.BugActivity;
import com.prem.blackhacker.Activity.CertificationsActivity;
import com.prem.blackhacker.Activity.CryptographyActivity;
import com.prem.blackhacker.Activity.CyberSecurityActivity;
import com.prem.blackhacker.Activity.ExperienceActivity;
import com.prem.blackhacker.Activity.ExploitationActivity;
import com.prem.blackhacker.Activity.FirewallActivity;
import com.prem.blackhacker.Activity.ForensicsActivity;
import com.prem.blackhacker.Activity.InformationGathActivity;
import com.prem.blackhacker.Activity.LegalEthicalActivity;
import com.prem.blackhacker.Activity.MetasploitActivity;
import com.prem.blackhacker.Activity.NetworkSecurityActivity;
import com.prem.blackhacker.Activity.NetworkingFundamentalActivity;
import com.prem.blackhacker.Activity.OperatingSystemActivity;
import com.prem.blackhacker.Activity.ProgrammingScriptingActivity;
import com.prem.blackhacker.Activity.ReverseActivity;
import com.prem.blackhacker.Activity.ScanningEnumActivity;
import com.prem.blackhacker.Activity.SocialEngiActivity;
import com.prem.blackhacker.Activity.ToolsActivity;
import com.prem.blackhacker.Activity.VulnerabilityActivity;
import com.prem.blackhacker.Activity.WebAppActivity;
import com.prem.blackhacker.Activity.WirelessSecurityActivity;
import com.prem.blackhacker.Ads.Admob;
import com.prem.blackhacker.Ads.OnDismiss;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Admob.setBanner(findViewById(R.id.banner_ads), MainActivity.this);

        DrawerLayoutMethod();
        NotificationPerm13();
        NavigationItem();
        ClickListeners();

    }
    public void DrawerLayoutMethod(){
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_bar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);
        actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void NotificationPerm13() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){
            int permissionNotif = ActivityCompat.checkSelfPermission(this, POST_NOTIFICATIONS);
            if(permissionNotif != PackageManager.PERMISSION_GRANTED){
                String[] NOTIF_PERM = {POST_NOTIFICATIONS};
                ActivityCompat.requestPermissions(this, NOTIF_PERM,100);
            }
        }
    }

    public void NavigationItem(){
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if(id == R.id.theme){
                    Toast.makeText(MainActivity.this, "No theme available!!!", Toast.LENGTH_SHORT).show();
                } else if (id== R.id.share_app) {
                    try {
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.setType("text/plain");
                        intent.putExtra(Intent.EXTRA_SUBJECT, "Share this app");
                        intent.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName());
                        startActivity(Intent.createChooser(intent, "Share with"));
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                } else if (id == R.id.rateUs) {
                    Uri uri = Uri.parse("https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName());
                    Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                    try {
                        startActivity(intent);
                    }catch (Exception e){
                        Toast.makeText(MainActivity.this, "Unable to open\n"+e.getMessage(), Toast.LENGTH_SHORT).show();

                    }
                }else if (id == R.id.linkedin) {
                    Uri uri = Uri.parse("https://www.linkedin.com/in/prem-maurya-80a285251/");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    try {
                        startActivity(intent);
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "Unable to open\n" + e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }else if (id == R.id.youtube) {
                    Uri uri = Uri.parse("https://www.youtube.com/channel/UCteQr9HxtE88C-w7MD6GM3w");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    try {
                        startActivity(intent);
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "Unable to open\n" + e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }else if (id == R.id.privacy_policy) {
                    Uri uri = Uri.parse("https://sites.google.com/view/blackhacker/home");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    try {
                        startActivity(intent);
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "Unable to open\n" + e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }else if (id == R.id.more_app) {
                    Uri uri = Uri.parse("https://play.google.com/store/apps/dev?id=7800284619870932914");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    try {
                        startActivity(intent);
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "Unable to open\n" + e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
                if(drawerLayout.isDrawerOpen(GravityCompat.START)){
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                return false;
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Exit")
                .setMessage("Are you sure you want to Exit?")
                .setNegativeButton("No",null)
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finishAffinity();
                    }
                }).show();
    }
    public void ClickListeners(){
        findViewById(R.id.networkingFun).setOnClickListener(v-> {
            startActivity(new Intent(MainActivity.this, NetworkingFundamentalActivity.class));
            new Admob(new OnDismiss() {
                @Override
                public void onDismiss() {

                }
            }).showInterstitialsAds(MainActivity.this, true);
        });
        findViewById(R.id.operatingSystem).setOnClickListener(v-> {
            startActivity(new Intent(MainActivity.this, OperatingSystemActivity.class));
            new Admob(new OnDismiss() {
                @Override
                public void onDismiss() {

                }
            }).showInterstitialsAds(MainActivity.this, true);
        });
        findViewById(R.id.programmingScript).setOnClickListener(v-> {
            startActivity(new Intent(MainActivity.this, ProgrammingScriptingActivity.class));
            new Admob(new OnDismiss() {
                @Override
                public void onDismiss() {

                }
            }).showInterstitialsAds(MainActivity.this, true);
        });
        findViewById(R.id.cyberSecurity).setOnClickListener(v-> {
            startActivity(new Intent(MainActivity.this, CyberSecurityActivity.class));
            new Admob(new OnDismiss() {
                @Override
                public void onDismiss() {

                }
            }).showInterstitialsAds(MainActivity.this, true);
        });
        findViewById(R.id.informationGath).setOnClickListener(v-> {
            startActivity(new Intent(MainActivity.this, InformationGathActivity.class));
            new Admob(new OnDismiss() {
                @Override
                public void onDismiss() {

                }
            }).showInterstitialsAds(MainActivity.this, true);
        });
        findViewById(R.id.scanningEnum).setOnClickListener(v-> {
            startActivity(new Intent(MainActivity.this, ScanningEnumActivity.class));
            new Admob(new OnDismiss() {
                @Override
                public void onDismiss() {

                }
            }).showInterstitialsAds(MainActivity.this, true);
        });
        findViewById(R.id.vulnerability).setOnClickListener(v-> {
            startActivity(new Intent(MainActivity.this, VulnerabilityActivity.class));
            new Admob(new OnDismiss() {
                @Override
                public void onDismiss() {

                }
            }).showInterstitialsAds(MainActivity.this, true);
        });
        findViewById(R.id.exlotation).setOnClickListener(v-> {
            startActivity(new Intent(MainActivity.this, ExploitationActivity.class));
            new Admob(new OnDismiss() {
                @Override
                public void onDismiss() {

                }
            }).showInterstitialsAds(MainActivity.this, true);
        });
        findViewById(R.id.webApp).setOnClickListener(v-> {
            startActivity(new Intent(MainActivity.this, WebAppActivity.class));
            new Admob(new OnDismiss() {
                @Override
                public void onDismiss() {

                }
            }).showInterstitialsAds(MainActivity.this, true);
        });
        findViewById(R.id.networkSecurity).setOnClickListener(v-> {
            startActivity(new Intent(MainActivity.this, NetworkSecurityActivity.class));
            new Admob(new OnDismiss() {
                @Override
                public void onDismiss() {

                }
            }).showInterstitialsAds(MainActivity.this, true);
        });
        findViewById(R.id.wirelessSecurity).setOnClickListener(v-> {
            startActivity(new Intent(MainActivity.this, WirelessSecurityActivity.class));
            new Admob(new OnDismiss() {
                @Override
                public void onDismiss() {

                }
            }).showInterstitialsAds(MainActivity.this, true);
        });
        findViewById(R.id.socialEngi).setOnClickListener(v-> {
            startActivity(new Intent(MainActivity.this, SocialEngiActivity.class));
            new Admob(new OnDismiss() {
                @Override
                public void onDismiss() {

                }
            }).showInterstitialsAds2(MainActivity.this, true);
        });
        findViewById(R.id.forensics).setOnClickListener(v-> {
            startActivity(new Intent(MainActivity.this, ForensicsActivity.class));
            new Admob(new OnDismiss() {
                @Override
                public void onDismiss() {

                }
            }).showInterstitialsAds2(MainActivity.this, true);
        });
        findViewById(R.id.crypthography).setOnClickListener(v-> {
            startActivity(new Intent(MainActivity.this, CryptographyActivity.class));
            new Admob(new OnDismiss() {
                @Override
                public void onDismiss() {

                }
            }).showInterstitialsAds2(MainActivity.this, true);
        });
        findViewById(R.id.metasploit).setOnClickListener(v-> {
            startActivity(new Intent(MainActivity.this, MetasploitActivity.class));
            new Admob(new OnDismiss() {
                @Override
                public void onDismiss() {

                }
            }).showInterstitialsAds2(MainActivity.this, true);
        });
        findViewById(R.id.firewall).setOnClickListener(v-> {
            startActivity(new Intent(MainActivity.this, FirewallActivity.class));
            new Admob(new OnDismiss() {
                @Override
                public void onDismiss() {

                }
            }).showInterstitialsAds2(MainActivity.this, true);
        });
        findViewById(R.id.buffer).setOnClickListener(v-> {
            startActivity(new Intent(MainActivity.this, BufferActivity.class));
            new Admob(new OnDismiss() {
                @Override
                public void onDismiss() {

                }
            }).showInterstitialsAds2(MainActivity.this, true);
        });
        findViewById(R.id.reverseEng).setOnClickListener(v-> {
            startActivity(new Intent(MainActivity.this, ReverseActivity.class));
            new Admob(new OnDismiss() {
                @Override
                public void onDismiss() {

                }
            }).showInterstitialsAds2(MainActivity.this, true);
        });
        findViewById(R.id.legalEthical).setOnClickListener(v-> {
            startActivity(new Intent(MainActivity.this, LegalEthicalActivity.class));
            new Admob(new OnDismiss() {
                @Override
                public void onDismiss() {

                }
            }).showInterstitialsAds2(MainActivity.this, true);
        });
        findViewById(R.id.certificate).setOnClickListener(v-> {
            startActivity(new Intent(MainActivity.this, CertificationsActivity.class));
            new Admob(new OnDismiss() {
                @Override
                public void onDismiss() {

                }
            }).showInterstitialsAds2(MainActivity.this, true);
        });
        findViewById(R.id.experience).setOnClickListener(v-> {
            startActivity(new Intent(MainActivity.this, ExperienceActivity.class));
            new Admob(new OnDismiss() {
                @Override
                public void onDismiss() {

                }
            }).showInterstitialsAds2(MainActivity.this, true);
        });
        findViewById(R.id.bugBounty).setOnClickListener(v-> {
            startActivity(new Intent(MainActivity.this, BugActivity.class));
            new Admob(new OnDismiss() {
                @Override
                public void onDismiss() {

                }
            }).showInterstitialsAds2(MainActivity.this, true);
        });
        findViewById(R.id.hackingTools).setOnClickListener(v-> {
            startActivity(new Intent(MainActivity.this, ToolsActivity.class));
            new Admob(new OnDismiss() {
                @Override
                public void onDismiss() {

                }
            }).showInterstitialsAds2(MainActivity.this, true);
        });
    }
}