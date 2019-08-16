package com.example.fragments.Activity;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fragments.Fragment.EmAltaFragment;
import com.example.fragments.Fragment.HomeFragment;
import com.example.fragments.Fragment.InscricaoFragment;
import com.example.fragments.R;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItem;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private SmartTabLayout smartTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setElevation(0);
        getSupportActionBar().setTitle("YouTube");


        viewPager = findViewById(R.id.viewPager);
        smartTabLayout = findViewById(R.id.viewPagerTab);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
          getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add("Home", HomeFragment.class)
                .add("Inscrições", InscricaoFragment.class)
                .add("Em Alta", EmAltaFragment.class)
                .create()
        );

        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);
    }
}
