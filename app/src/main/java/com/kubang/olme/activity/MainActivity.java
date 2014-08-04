package com.kubang.olme.activity;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.kubang.olme.adapter.Myadapter;
import com.kubang.olme.dataSource.DataSource;
import com.kubang.olme.fragment.ClassFragment;
import com.kubang.olme.fragment.DiscussFragment;
import com.kubang.olme.fragment.HomeFragment;
import com.kubang.olme.fragment.PersonalFragment;
import com.kubang.olme.fragment.RecommendFragment;
import com.kubang.olme.onClickListener.MyOnClickListener;
import com.kubang.olme.onPageChangeListener.MyOnPageChangeListener;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
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

	private TextView head, classes, discuss, personal, recommend;
    private List<TextView> textviewList;
    private Myadapter adapters;
    private int currIndex = 0;// 当前页卡编号
    private FragmentManager manager;
    private List<Fragment> list = null;
	
	@AfterViews
	void init() {
		initTextView();
		initViewPager();
	}

	public void initTextView() {
		head = (TextView) findViewById(R.id.headpage);
		classes = (TextView) findViewById(R.id.classpage);
		discuss = (TextView) findViewById(R.id.discusspage);
		personal = (TextView) findViewById(R.id.personalpage);
		recommend = (TextView) findViewById(R.id.recommendpage);
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
		recommend.setOnClickListener(new MyOnClickListener(viewpager,textviewList, 4));
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
        adapters = new Myadapter(manager,list);
        viewpager.setAdapter(adapters);
        viewpager.setOnPageChangeListener(new MyOnPageChangeListener(textviewList,currIndex));
        adapters.notifyDataSetChanged();;
	}
}

