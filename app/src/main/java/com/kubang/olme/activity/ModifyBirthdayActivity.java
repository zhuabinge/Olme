package com.kubang.olme.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;

import com.kubang.olme.application.ExitApplication;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by Bingo on 2014/8/15.
 * 修改我的生日
 */
@EActivity(R.layout.activity_modifybirthday)
public class ModifyBirthdayActivity extends Activity {

    @ViewById(R.id.datePicker)
    DatePicker datePicker;

    @ViewById(R.id.birthdaySave)
    Button birthdaySave;

    private SharedPreferences.Editor sharedata;
    private String tempData;
    private String oldBirthday;

    @AfterViews
    void init() {
        ExitApplication.getInstance().addActivity(this);
        sharedata = getSharedPreferences("userInfo", 0).edit();

        Intent intent = getIntent();
        oldBirthday = intent.getStringExtra("oldBirthday");
//        content.setText(oldAddress);

        Window window = getWindow();
        WindowManager.LayoutParams layoutParams = window.getAttributes();
        //设置窗口的大小及透明度
        layoutParams.width = WindowManager.LayoutParams.WRAP_CONTENT;
        layoutParams.height = layoutParams.WRAP_CONTENT;
        window.setAttributes(layoutParams);
        this.setFinishOnTouchOutside(true);
    }


    @Click(R.id.birthdaySave)
    void birthdaySaveIsClicked(){
        sharedata.putString("userBirthday",tempData);
        sharedata.commit();
    }
}
