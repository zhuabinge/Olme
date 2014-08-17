package com.kubang.olme.activity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.view.Window;
import android.view.WindowManager;

import com.kubang.olme.application.ExitApplication;

import org.androidannotations.annotations.EActivity;

/**
 * Created by Bingo on 2014/8/17.
 */

@EActivity(R.layout.activity_reply)
public class ReplyActivity extends Activity {
    void init() {
        ExitApplication.getInstance().addActivity(this);
        //初始化界面
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams = window.getAttributes();
        //设置窗口的大小及透明度
        layoutParams.width = WindowManager.LayoutParams.WRAP_CONTENT;
        layoutParams.height = layoutParams.WRAP_CONTENT;
        window.setAttributes(layoutParams);
        this.setFinishOnTouchOutside(true);
    }
}
