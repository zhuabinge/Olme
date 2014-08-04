package com.kubang.olme.adapter;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;

public class MyFragmentadapter extends FragmentPagerAdapter {
    private FragmentManager fm;
    private List<Fragment> list;
    public MyFragmentadapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.fm = fm;
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        // TODO Auto-generated method stub
        return list.get(position);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return list.size();
    }
}
