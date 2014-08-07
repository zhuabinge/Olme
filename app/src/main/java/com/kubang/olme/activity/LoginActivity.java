package com.kubang.olme.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

import com.kubang.olme.api.OlmeApi;
import com.kubang.olme.domain.TUser;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.CheckedChange;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.rest.RestService;
import org.springframework.web.client.HttpStatusCodeException;

@EActivity(R.layout.activity_login)
public class LoginActivity extends Activity {

    @ViewById(R.id.returnbt)
    ImageView returnbt;

    @ViewById(R.id.et_username)
    EditText etUsername;

    @ViewById(R.id.et_password)
    EditText etPassword;

    @ViewById(R.id.checkboxpw)
    CheckBox cbpassword;

    @ViewById(R.id.checkboxlg)
    CheckBox cblogin;

    @ViewById(R.id.btn_login)
    Button btn;

    @ViewById(R.id.btn_register)
    Button btr;

    @RestService
    OlmeApi olmeApi;

    String username;
    String password;
    private SharedPreferences.Editor sharedata;

    @AfterViews
    void init(){
        sharedata = getSharedPreferences("userInfo", 0).edit();
    }

    @CheckedChange(R.id.checkboxpw)
    void cbpasswordIsChecked(){
        if (cbpassword.isChecked()) {
            sharedata.putBoolean("ISCHECK", true);
            sharedata.commit();
            //sp.edit().putBoolean("ISCHECK", true).commit();
        }else {
            System.out.println("记住密码没有选中");
            sharedata.putBoolean("ISCHECK", false);
            sharedata.commit();
        }
    }

    @CheckedChange(R.id.checkboxlg)
    void cbloginIsChecked(){
        if (cblogin.isChecked()) {
            sharedata.putBoolean("AUTO_ISCHECK", true);
            sharedata.commit();
        }else {
            sharedata.putBoolean("AUTO_ISCHECK", false);
            sharedata.commit();
        }
    }

    @Click(R.id.btn_login)
    void buttonIsClicked(){
        username = etUsername.getText().toString().trim();
        password = etPassword.getText().toString().trim();
        login(username,password);
    }

    @Click(R.id.btn_register)
    void buttonIsClick(){
        Intent intent = new Intent(this,RegisterActivity_.class);
        startActivity(intent);
    }

    @Click(R.id.returnbt)
    void returnbtIsClick(){
        LoginActivity.this.finish();
    }

    @Background
    void login(String username,String password) {
        try {
            TUser user = olmeApi.login(username,password);
            System.out.println(user.toString());
            if(cbpassword.isChecked())
            {
                //记住用户名、密码、
                sharedata.putString("USER_NAME", username);
                sharedata.putString("PASSWORD",password);
                sharedata.commit();
            }
        }catch (HttpStatusCodeException e){
            showErroResult(e.getStatusCode().value());
        }
    }

    /**
     * 展示http请求异常结果
     * @param requestCode
     */
    @UiThread
    void showErroResult(int requestCode){
        if(requestCode == 404){

        }else{
        }
    }

    private boolean vilidata(String username,String password) {
        if("".equals(username))
            return false;
        if("".equals(password))
            return false;
        return true;
    }
}
