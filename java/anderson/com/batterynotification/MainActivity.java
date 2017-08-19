package anderson.com.batterynotification;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;

import anderson.com.batterynotification.domain.Action;
import anderson.com.batterynotification.domain.ActionAdapter;
import anderson.com.batterynotification.util.FakeCollection;

public class MainActivity extends AppCompatActivity {

    private AdView adView;
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adView = (AdView) findViewById(R.id.adBanner);
        AdRequest adRequest = new AdRequest.Builder()
                              .addTestDevice("ca-app-pub-7972124968370078~5761614343")
                              .build();
        adView.loadAd(adRequest);

        interstitialAd = new InterstitialAd(MainActivity.this);
        interstitialAd.setAdUnitId(getString(R.string.interstitial_id));



        ArrayList<Action> actions = FakeCollection.getActions();
        ActionAdapter adapter2 = new ActionAdapter( MainActivity.this, actions );

        ListView lv = (ListView) findViewById(R.id.lv_actions);

        lv.setAdapter( adapter2 );
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        Toast.makeText(MainActivity.this, "Battery notification is ON", Toast.LENGTH_SHORT).show();
                        Intent start = new Intent(MainActivity.this, ServiceBateria.class);
                        startService(start);

                        break;
                    case 1:
                        Intent stop = new Intent(MainActivity.this, ServiceBateria.class);

                        loadInterstitial();
                        interstitialAd.setAdListener(new AdListener() {
                            @Override
                            public void onAdClosed() {
                                loadInterstitial();
                            }
                        });

                        interstitialAd.show();

                        stopService(stop);

                        break;
                    case 2:

                        finish();
                        break;
                }
            }
        });

    }

    private void loadInterstitial() {
        AdRequest interAdRequest = new AdRequest.Builder().build();
        interstitialAd.loadAd(interAdRequest);
    }

    @Override
    protected void onPause() {
        if(adView != null) {
            adView.pause();
        }
         super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(adView != null) {
            adView.resume();
        }
    }

    @Override
    protected void onDestroy() {
        if(adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_about, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if(id == R.id.about_menu) {
            Intent i = new Intent(this, About.class);
            startActivity(i);
        }

        return true;
    }

}
