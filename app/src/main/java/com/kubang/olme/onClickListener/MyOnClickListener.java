package com.kubang.olme.onClickListener;

import java.util.List;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

public class MyOnClickListener implements View.OnClickListener {
	private int index = 0;
	private ViewPager viewpager;
	private List<TextView> textviewList;
	
	public MyOnClickListener(ViewPager viewpager, List<TextView> textviewList, int i) {
		index = i;
		this.viewpager = viewpager;
		this.textviewList = textviewList;
	}

	@Override
	public void onClick(View v) {
		textviewList.get(viewpager.getCurrentItem()).setBackgroundColor(android.graphics.Color.parseColor("#1E90FF"));
		textviewList.get(index).setBackgroundColor(android.graphics.Color.parseColor("#00BFFF"));
		viewpager.setCurrentItem(index);
	}
};
