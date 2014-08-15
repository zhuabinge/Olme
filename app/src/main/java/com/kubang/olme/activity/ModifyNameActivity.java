package com.kubang.olme.activity;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

import com.kubang.olme.application.ExitApplication;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

/**
 * Created by Bingo on 2014/8/15.
 */
@EActivity(R.layout.activity_modifyname)
public class ModifyNameActivity extends Activity{


    @AfterViews
    void init() {
        ExitApplication.getInstance().addActivity(this);
//        sharedata = getSharedPreferences("userInfo", 0).edit();

//        Intent intent = getIntent();
//        oldAddress = intent.getStringExtra("oldAddress");
//        content.setText(oldAddress);

        Window window = getWindow();
        WindowManager.LayoutParams layoutParams = window.getAttributes();
        //设置窗口的大小及透明度
        layoutParams.width = WindowManager.LayoutParams.WRAP_CONTENT;
        layoutParams.height = layoutParams.WRAP_CONTENT;
        window.setAttributes(layoutParams);
        this.setFinishOnTouchOutside(true);
    }
}
