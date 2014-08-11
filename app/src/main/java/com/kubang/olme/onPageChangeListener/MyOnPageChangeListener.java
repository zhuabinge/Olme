package com.kubang.olme.onPageChangeListener;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RemoteViews;
import android.widget.TextView;

import com.kubang.olme.PopupWindow.LoginTipPopWindow;
import com.kubang.olme.activity.R;
import com.kubang.olme.application.CustomApplication;

/**
 * 页卡切换监听
 */
public class MyOnPageChangeListener implements OnPageChangeListener {
	private int currIndex = 0;// 当前页卡编号
	private List<TextView> textviewList;
    private CustomApplication app;
    private List<Fragment> list;
	
	public MyOnPageChangeListener(List<Fragment> list,List<TextView> textviewList,
			int currIndex) {
        this.list = list;
		this.textviewList = textviewList;
		this.currIndex = currIndex;
	}
	
	@Override
	public void onPageSelected(int arg0) {
		textviewList.get(currIndex).setBackgroundColor(android.graphics.Color.parseColor("#0360f9"));
		textviewList.get(arg0).setBackgroundColor(android.graphics.Color.parseColor("#00BFFF"));
		currIndex = arg0;
        try {
            if (currIndex == 3) {
                app = (CustomApplication) list.get(currIndex).getActivity().getApplication();
                if ("Logout".equals(app.getValue())) {
                    LayoutInflater inflater = (LayoutInflater) LayoutInflater.from(list.get(currIndex).getActivity());
                    View view = inflater.inflate(R.layout.tab4, null);
                    new LoginTipPopWindow(list.get(currIndex).getActivity(), view);
                }
            }
        }catch (Exception e){
            System.out.println(e.toString());
        }
	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
	}

	@Override
	public void onPageScrollStateChanged(int arg0) {
	}


}