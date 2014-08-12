package com.kubang.olme.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.kubang.olme.PopupWindow.MorePopWindow;
import com.kubang.olme.api.OlmeApi;
import com.kubang.olme.application.ExitApplication;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.rest.RestService;
import org.springframework.web.client.HttpStatusCodeException;

/**
 * Created by Bingo on 2014/8/7.
 */
@EActivity(R.layout.activity_register)
public class RegisterActivity extends Activity {
    @ViewById(R.id.rg_username)
    EditText etUsername;

    @ViewById(R.id.rg_password)
    EditText etPassword;

    @ViewById(R.id.rg_surepassword)
    EditText etsPassword;

    @ViewById(R.id.morebt)
    ImageView morebt;

    @RestService
    OlmeApi olmeApi;

    private SharedPreferences.Editor sharedata;
    private LayoutInflater inflater;
    private View views;
    private String username;
    private String password;
    private String surepassword;
    private Toast toast;

    @AfterViews
    void init() {
        ExitApplication.getInstance().addActivity(this);
        sharedata = getSharedPreferences("userInfo", 0).edit();
        inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        views = inflater.inflate(    //获取自定义布局文件dialog.xml的视图
                R.layout.activity_main, null, false);
    }

    @Click(R.id.btn_register)
    void regbtIsClick() {
        username = etUsername.getText().toString().trim();  //获取页面填的账号信息
        password = etPassword.getText().toString().trim();  //获取页面填的密码信息
        surepassword = etsPassword.getText().toString().trim();  //获取页面填的密码信息
        if (!"".equals(username) && !"".equals(password) && !"".equals(surepassword)) {
            if (password.equals(surepassword)) {
                register(username, password);
            } else {
                toast = Toast.makeText(RegisterActivity.this,
                        "两次输入的密码不一致，请重新输入！", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        } else {
            toast = Toast.makeText(RegisterActivity.this,
                    "不能为空，请重新输入！", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }


    @Background
    void register(String username, String password) {
        try {
            Boolean flag = olmeApi.registers(username, password);
            if (flag) {
                toast = Toast.makeText(RegisterActivity.this,
                        "注册成功！3秒后自动跳转到登陆界面", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                try {
                    Thread.currentThread().sleep(3000);
                    Intent intent = new Intent(RegisterActivity.this, LoginActivity_.class);
                    startActivity(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                toast = Toast.makeText(RegisterActivity.this, "该邮箱已被注册，请选择其他邮箱！", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        } catch (HttpStatusCodeException e) {
            showErroResult(e.getStatusCode().value());
        }
    }

    /**
     * 展示http请求异常结果
     *
     * @param requestCode
     */
    @UiThread
    void showErroResult(int requestCode) {
        if (requestCode == 404) {

        } else {
        }
    }

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
