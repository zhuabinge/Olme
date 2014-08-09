package com.kubang.olme.activity;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.kubang.olme.PopupWindow.MorePopWindow;
import com.kubang.olme.application.ExitApplication;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by Bingo on 2014/8/7.
 */
@EActivity(R.layout.activity_register)
public class RegisterActivity extends Activity {
    @ViewById(R.id.rg_username)
    EditText username;

    @ViewById(R.id.rg_password)
    EditText password;

    @ViewById(R.id.rg_surepassword)
    EditText surepassword;

    @ViewById(R.id.morebt)
    ImageView morebt;

    private SharedPreferences.Editor sharedata;
    private LayoutInflater inflater;
    private View views;

    @AfterViews
    void init() {
        ExitApplication.getInstance().addActivity(this);
        sharedata = getSharedPreferences("userInfo", 0).edit();
        inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        views = inflater.inflate(    //获取自定义布局文件dialog.xml的视图
                R.layout.activity_main, null, false);
    }

//    @Click(R.id.rg_username)
//    void usernameIsClick(){
//        username.setText("");
//    }
//
//    @Click(R.id.rg_password)
//    void passwordIsClick(){
//        password.setText("");
//    }
//
//    @Click(R.id.rg_surepassword)
//    void surepasswordIsClick(){
//        surepassword.setText("");
//    }

    @Click(R.id.returnbt)
    void returnbtIsClick() {
        RegisterActivity.this.finish();  //结束本Activity
    }

    @Click(R.id.morebt)
    void morebtIsClick() {
        MorePopWindow morePopWindow = new MorePopWindow(RegisterActivity.this, views);
        morePopWindow.showPopupWindow(morebt);  //显示more窗口
    }
}
