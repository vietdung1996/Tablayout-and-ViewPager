package com.vietdung.tablayoutandviewpager;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.vietdung.tablayoutandviewpager.fragment.FragmentOne;
import com.vietdung.tablayoutandviewpager.fragment.FragmentThree;
import com.vietdung.tablayoutandviewpager.fragment.FragmentTwo;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private static final int pageLimit = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setupViewPager();
        mTabLayout.setupWithViewPager(mViewPager);
        setupTabIcon();
    }

    private void setupViewPager() {
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new FragmentOne(), getString(R.string.first));
        pagerAdapter.addFragment(new FragmentTwo(), getString(R.string.second));
        pagerAdapter.addFragment(new FragmentThree(), getString(R.string.three));
        mViewPager.setAdapter(pagerAdapter);
        mViewPager.setOffscreenPageLimit(pageLimit);
    }

    private void initView() {
        mTabLayout = findViewById(R.id.tab_layout);
        mViewPager = findViewById(R.id.view_pager);
    }

    public void setupTabIcon() {
        mTabLayout.getTabAt(0).setIcon(R.mipmap.ic_launcher_round);
        mTabLayout.getTabAt(1).setIcon(R.mipmap.ic_launcher_round);
        mTabLayout.getTabAt(2).setIcon(R.mipmap.ic_launcher_round);

    }
}
