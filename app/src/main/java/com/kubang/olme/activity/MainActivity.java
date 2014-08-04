package com.kubang.olme.activity;

import java.util.ArrayList;
import java.util.List;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.kubang.olme.PopupWindow.MorePopWindow;
import com.kubang.olme.adapter.MyFragmentadapter;
import com.kubang.olme.fragment.ClassFragment;
import com.kubang.olme.fragment.DiscussFragment;
import com.kubang.olme.fragment.HomeFragment;
import com.kubang.olme.fragment.PersonalFragment;
import com.kubang.olme.fragment.RecommendFragment;
import com.kubang.olme.onClickListener.MyOnClickListener;
import com.kubang.olme.onPageChangeListener.MyOnPageChangeListener;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends FragmentActivity {

    @ViewById(R.id.viewpage1)
    ViewPager viewpager;

    @ViewById(R.id.searchbt)
    ImageView searchbt;

    @ViewById(R.id.morebt)
    ImageView morebt;

    @ViewById(R.id.headpage)
    TextView head;

    @ViewById(R.id.classpage)
    TextView classes;

    @ViewById(R.id.discusspage)
    TextView discuss;

    @ViewById(R.id.personalpage)
    TextView personal;

    @ViewById(R.id.recommendpage)
    TextView recommend;

    private List<TextView> textviewList;
    private MyFragmentadapter adapters;
    private int currIndex = 0;// 当前页卡编号
    private FragmentManager manager;
    private List<Fragment> list = null;

    @Click(R.id.morebt)
    void morebtIsClick() {
        MorePopWindow morePopWindow = new MorePopWindow(MainActivity.this);
        morePopWindow.showPopupWindow(morebt);
    }


    @AfterViews
    void init() {
        initTextView();
        initViewPager();
    }

    public void initTextView() {
        textviewList = new ArrayList<TextView>();
        textviewList.add(head);
        textviewList.add(classes);
        textviewList.add(discuss);
        textviewList.add(personal);
        textviewList.add(recommend);
        head.setBackgroundColor(android.graphics.Color.parseColor("#00BFFF")); //设置起始背景色
        head.setOnClickListener(new MyOnClickListener(viewpager, textviewList, 0));
        classes.setOnClickListener(new MyOnClickListener(viewpager, textviewList, 1));
        discuss.setOnClickListener(new MyOnClickListener(viewpager, textviewList, 2));
        personal.setOnClickListener(new MyOnClickListener(viewpager, textviewList, 3));
        recommend.setOnClickListener(new MyOnClickListener(viewpager, textviewList, 4));
    }

    public void initViewPager() {
        manager = getSupportFragmentManager();
        list = new ArrayList<Fragment>();
        list.add(new HomeFragment());
        list.add(new ClassFragment());
        list.add(new DiscussFragment());
        list.add(new PersonalFragment());
        list.add(new RecommendFragment());
        // transaction = manager.beginTransaction();
        adapters = new MyFragmentadapter(manager, list);
        viewpager.setAdapter(adapters);
        viewpager.setOnPageChangeListener(new MyOnPageChangeListener(textviewList, currIndex));
        adapters.notifyDataSetChanged();
        ;
    }
}

