package com.wolfsoft.coffe;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import adapter.ViewpagerAdapter;
import me.relex.circleindicator.CircleIndicator;

public class OnBoarding_MainActivity extends AppCompatActivity {
    private ViewpagerAdapter viewpagerAdapter;
    private ViewPager viewPager;
    private CircleIndicator circleIndicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding__main);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        CircleIndicator circleIndicator =(CircleIndicator) findViewById(R.id.circleindicator);
        viewpagerAdapter = new ViewpagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewpagerAdapter);
        circleIndicator.setViewPager(viewPager);
        viewpagerAdapter.registerDataSetObserver(circleIndicator.getDataSetObserver());
    }
}
