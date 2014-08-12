package com.kubang.olme.activity;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.InputQueue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.kubang.olme.application.ExitApplication;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by Bingo on 2014/8/13.
 */
@EActivity(R.layout.activity_logout_dialog)
public class LogoutActivity extends Activity {
    @ViewById(R.id.closeApp)
    LinearLayout closeApp;

    @ViewById(R.id.logout)
    LinearLayout logout;

    @Click(R.id.closeApp)
    void closeAppIsClick(){
        ExitApplication.getInstance().exit();
    }

    @Click(R.id.logout)
    void logoutIsClick(){
    }

    @AfterViews
    void init(){
        ExitApplication.getInstance().addActivity(this);
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams = window.getAttributes();
        //设置窗口的大小及透明度
        layoutParams.width = WindowManager.LayoutParams.WRAP_CONTENT;
        layoutParams.height = layoutParams.WRAP_CONTENT;
        window.setAttributes(layoutParams);
        this.setFinishOnTouchOutside(true);
    }
}
