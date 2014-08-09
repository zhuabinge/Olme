package com.kubang.olme.application;

import android.app.Application;

/**
 * Created by Bingo on 2014/8/9.
 */
public class LoginApplication extends Application {
    private static final int VALUE = -1;

    private int value;

    @Override
    public void onCreate() {
        super.onCreate();
        setValue(VALUE); // 初始化全局变量
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
