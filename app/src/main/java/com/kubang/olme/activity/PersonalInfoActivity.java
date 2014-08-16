package com.kubang.olme.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
 * 个人信息
 */

@EActivity(R.layout.activity_personalinfo)
public class PersonalInfoActivity extends Activity {
    //    ExitApplication.getInstance().addActivity(this);
    @ViewById(R.id.morebt)
    ImageView morebt;

    @ViewById(R.id.headTitle)
    TextView headTitle;

    @ViewById(R.id.infoHeadIcon)
    ImageView infoHeadIcon;

    @ViewById(R.id.infoName)
    TextView infoName;

    @ViewById(R.id.infoBirthday)
    TextView infoBirthday;

    @ViewById(R.id.infoAddress)
    TextView infoAddress;

    @ViewById(R.id.infoSex)
    TextView infoSex;

    @ViewById(R.id.infoPhone)
    TextView infoPhone;
    @ViewById(R.id.infoEmail)
    TextView infoEmail;
    private LayoutInflater inflater;
    private View views;
    private Byte[] userphoto;
    private String userName;
    private String userEmail;
    private String userBirthday;
    private String userAddress;
    private String userSex;
    private String userPhone;
    /**
     * 昵称的requestCode
     */
    private static int REQUESTCODE_NAME = 1;
    private static int REQUESTCODE_BIRTHDAY = 2;
    private static int REQUESTCODE_ADDRESS = 3;
    private static int REQUESTCODE_SEX = 4;
    private static int REQUESTCODE_PHONE = 5;

    @AfterViews
    void init() {
        headTitle.setText("个人资料");
        ExitApplication.getInstance().addActivity(this);
        inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        views = inflater.inflate(    //获取自定义布局文件dialog.xml的视图
                R.layout.activity_personalinfo, null, false);

        SharedPreferences sp = sp = this.getSharedPreferences("userInfo", 0);
        userName = sp.getString("userName", "");
        userEmail = sp.getString("userEmail", "");
        userAddress = sp.getString("userAddress", "");
        userBirthday = sp.getString("userBirthday", "");
        userPhone = sp.getString("userPhone", "");
        userSex = sp.getString("userSex", "");

        //设置TextView显示用户属性
        infoName.setText(this.userName);
        infoEmail.setText(this.userEmail);
        infoAddress.setText(userAddress);
        infoPhone.setText(this.userPhone);
        infoSex.setText(this.userSex);
        infoBirthday.setText(this.userBirthday);
    }


    @Click(R.id.myHeadPhoto)
    void myHeadPhotoIsClicked() {
        Intent intent = new Intent(this, ModifyHeadPhotoActivity_.class);
        startActivity(intent);
    }

    @Click(R.id.myName)
    void myNameIsClicked() {
        Intent intent = new Intent(this, ModifyNameActivity_.class);
        startActivityForResult(intent, PersonalInfoActivity.REQUESTCODE_NAME);
    }

    @Click(R.id.myBirthday)
    void myBirthdayIsClicked() {
        Intent intent = new Intent(this, ModifyBirthdayActivity_.class);
        startActivityForResult(intent, PersonalInfoActivity.REQUESTCODE_BIRTHDAY);
    }

    @Click(R.id.myAddress)
    void myAddressIsClicked() {
        Intent intent = new Intent(this, ModifyAddressActivity_.class);
        intent.putExtra("oldAddress", userAddress);
        startActivityForResult(intent, PersonalInfoActivity.REQUESTCODE_ADDRESS);
    }

    @Click(R.id.mySex)
    void mySexIsClicked() {
        Intent intent = new Intent(this, ModifySexActivity_.class);
        startActivityForResult(intent, PersonalInfoActivity.REQUESTCODE_SEX);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 9) {
            String editTextValue = data.getStringExtra("editTextValue");
            if (requestCode == REQUESTCODE_SEX) {
                infoSex.setText(editTextValue);
            } else if (requestCode == REQUESTCODE_NAME) {
                infoName.setText(editTextValue);
            } else if (requestCode == REQUESTCODE_ADDRESS) {
                infoAddress.setText(editTextValue);
            } else if (requestCode == REQUESTCODE_PHONE) {
                infoPhone.setText(editTextValue);
            } else if (requestCode == REQUESTCODE_BIRTHDAY) {
                infoBirthday.setText(editTextValue);
            }
        }
    }

    @Click(R.id.myPhone)
    void myPhoneIsClicked() {
        Intent intent = new Intent(this, ModifyPhoneActivity_.class);
        startActivityForResult(intent, PersonalInfoActivity.REQUESTCODE_PHONE);
    }


    @Click(R.id.returnbt)
        //返回前个页面
    void returnbtIsClicked() {
        headTitle.setText("");
        PersonalInfoActivity.this.finish();  //结束本Activity
    }

    @Click(R.id.morebt)
        //显示下拉菜单
    void morebtIsClicked() {
        MorePopWindow morePopWindow = new MorePopWindow(PersonalInfoActivity.this, views);
        morePopWindow.showPopupWindow(morebt);  //显示more窗口
    }
}
