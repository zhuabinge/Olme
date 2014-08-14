package com.kubang.olme.activity;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kubang.olme.PopupWindow.MorePopWindow;
import com.kubang.olme.application.ExitApplication;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by Bingo on 2014/8/10.
 */

@EActivity(R.layout.activity_personalinfo)
public class PersonalInfoActivity extends Activity {
    //    ExitApplication.getInstance().addActivity(this);
    @ViewById(R.id.morebt)
    ImageView morebt;

    @ViewById(R.id.headTitle)
    TextView headTitle;


    private LayoutInflater inflater;
    private View views;

    @AfterViews
    void init() {
        headTitle.setText("个人资料");
        ExitApplication.getInstance().addActivity(this);
        inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        views = inflater.inflate(    //获取自定义布局文件dialog.xml的视图
                R.layout.activity_personalinfo, null, false);
    }


    @Click(R.id.returnbt)
    void returnbtIsClick() {
        headTitle.setText("");
        PersonalInfoActivity.this.finish();  //结束本Activity
    }

    @Click(R.id.morebt)
    void morebtIsClick() {
        MorePopWindow morePopWindow = new MorePopWindow(PersonalInfoActivity.this, views);
        morePopWindow.showPopupWindow(morebt);  //显示more窗口
    }
}
