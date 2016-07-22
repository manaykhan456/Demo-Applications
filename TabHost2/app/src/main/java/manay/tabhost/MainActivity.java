package manay.tabhost;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabWidget;

public class MainActivity extends AppCompatActivity {
    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost host = (TabHost) findViewById(R.id.tab_host);
        TabWidget hostTabs = (TabWidget) findViewById(R.id.tab_widget);
        host.setup();
        setupTabHost1();
        setupTabHost2();
        setupTabHost3();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void setupTabHost1(){
        TabHost.TabSpec spec= tabHost.newTabSpec("Tab One");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Tab One",getDrawable(R.drawable.ic_android_black_24dp));
        tabHost.addTab(spec);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void setupTabHost2(){
        TabHost.TabSpec spec= tabHost.newTabSpec("Tab Two");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Tab Two",getDrawable(R.drawable.ic_android_black_24dp));
        tabHost.addTab(spec);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void setupTabHost3(){
        TabHost.TabSpec spec= tabHost.newTabSpec("Tab Three");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Tab Three",getDrawable(R.drawable.ic_android_black_24dp));
        tabHost.addTab(spec);
    }
}
