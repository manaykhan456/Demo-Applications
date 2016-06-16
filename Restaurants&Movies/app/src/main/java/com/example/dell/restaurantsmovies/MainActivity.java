package com.example.dell.restaurantsmovies;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dell.fragment.MovieFragment;
import com.example.dell.fragment.RestaurantFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linkXML();
//        replaceFragment(new RestaurantFragment(), "Restaurant", getFragmentManager());
    }

    private void linkXML() {
        findViewById(R.id.button_restaurants).setOnClickListener(this);
        findViewById(R.id.button_movies).setOnClickListener(this);
    }

    private void replaceFragment(Fragment fragment, String TAG, FragmentManager manager){
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment, fragment, TAG);
        fragmentTransaction.commit();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_restaurants :
                replaceFragment(new RestaurantFragment(), "Restaurant", getFragmentManager());
                break;
            case R.id.button_movies :
                replaceFragment(new MovieFragment(), "Movie", getFragmentManager());
                break;
        }
    }
}
