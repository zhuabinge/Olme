package com.kubang.olme.activity;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.content.Intent;
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
import com.kubang.olme.onClickListener.MyOnClickListener;
import com.kubang.olme.onPageChangeListener.MyOnPageChangeListener;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {

	@ViewById(R.id.viewpage1)
	ViewPager viewpager;

	@ViewById(R.id.searchbt)
	ImageView searchbt;

	@ViewById(R.id.morebt)
	ImageView morebt;

    @ViewById(R.id.button1)
    Button button;

	@Bean
	DataSource data;

	private TextView head, classes, discuss, personal, recommend;
	private List<TextView> textviewList;
	private SimpleAdapter adapter;
	private List<View> list = null;
    private int currIndex = 0;// 当前页卡编号
	
	
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
		LayoutInflater inflaters = getLayoutInflater();
		ListView listView1 = (ListView) (inflaters.inflate(R.layout.tab1, null))
				.findViewById(R.id.listview);
		adapter = new SimpleAdapter(this, data.getDataSource(), R.layout.item,
				new String[] { "img", "username", "phone", "address" },
				new int[] { R.id.img, R.id.username, R.id.phone, R.id.address });
		listView1.setAdapter(adapter);
		View view2 = inflaters.inflate(R.layout.tab2, null);
		View view3 = inflaters.inflate(R.layout.tab3, null);
		View view4 = inflaters.inflate(R.layout.tab4, null);
		View view5 = inflaters.inflate(R.layout.tab5, null);
		list = new ArrayList<View>();
		list.add(listView1);
		list.add(view2);
		list.add(view3);
		list.add(view4);
		list.add(view5);
		viewpager.setAdapter(new Myadapter(list));
		viewpager.setOnPageChangeListener(new MyOnPageChangeListener(textviewList,currIndex));
//        button.setOnClickListener();
	}

    public void onClick(View v) {
        Intent intent = new Intent(this,LoginActivity_.class);
        startActivity(intent);
     }
}

