package com.kubang.olme.onPageChangeListener;

import java.util.List;

import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.widget.TextView;

/**
 * 页卡切换监听
 */
public class MyOnPageChangeListener implements OnPageChangeListener {
	private int currIndex = 0;// 当前页卡编号
	private List<TextView> textviewList;
	
	public MyOnPageChangeListener(List<TextView> textviewList,
			int currIndex) {
		this.textviewList = textviewList;
		this.currIndex = currIndex;
	}
	
	@Override
	public void onPageSelected(int arg0) {
		textviewList.get(currIndex).setBackgroundColor(android.graphics.Color.parseColor("#1E90FF"));
		textviewList.get(arg0).setBackgroundColor(android.graphics.Color.parseColor("#00BFFF"));
		currIndex = arg0;
	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
	}

	@Override
	public void onPageScrollStateChanged(int arg0) {
	}
}