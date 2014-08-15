package com.kubang.olme.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.kubang.olme.activity.R;
import com.kubang.olme.application.ExitApplication;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by Bingo on 2014/8/13.
 */

//public class LogoutDialog extends Dialog {
//
//    private Context context;
//
//    public LogoutDialog(Context context) {
//        super(context);
//        this.context = context;
//    }
//
//    public LogoutDialog(Context context, int theme) {
//        super(context, theme);
//        this.context = context;
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        this.setContentView(R.layout.activity_logout_dialog);
//        LinearLayout closeApp = (LinearLayout) this.findViewById(R.id.closeApp);
//        LinearLayout logoff = (LinearLayout) this.findViewById(R.id.logoff);
//
//        closeApp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ExitApplication.getInstance().exit();
//            }
//        });
//
//        logoff.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                System.out.println("注销");
//            }
//        });
//
//        this.setCanceledOnTouchOutside(true);
//    }
//}

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
