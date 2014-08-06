package com.kubang.olme.activity;

import android.app.Activity;
import android.widget.EditText;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by Bingo on 2014/8/7.
 */
@EActivity(R.layout.activity_register)
public class RegisterActivity extends Activity{
    @ViewById(R.id.rg_username)
    EditText username;

    @ViewById(R.id.rg_password)
    EditText password;

    @ViewById(R.id.rg_surepassword)
    EditText surepassword;

    @Click(R.id.rg_username)
    void usernameIsClick(){
        username.setText("");
    }

    @Click(R.id.rg_password)
    void passwordIsClick(){
        password.setText("");
    }

    @Click(R.id.rg_surepassword)
    void surepasswordIsClick(){
        surepassword.setText("");
    }

    @Click(R.id.returnbt)
    void returnbtIsClick(){
        RegisterActivity.this.finish();
    }
}
