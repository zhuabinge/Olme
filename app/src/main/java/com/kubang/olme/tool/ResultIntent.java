package com.kubang.olme.tool;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by ye on 2014/8/16.
 * 为startActivityForResult提供返回数据
 */
public class ResultIntent {
    /**
     * 设置返回的数据
     * @param activity 数据返回的界面
     * @param editTextValue 传输信息
     */
    public static void  resultIntent(Activity activity,String editTextValue){
        Intent intent = new Intent();
        intent.putExtra("editTextValue", editTextValue);
        activity.setResult(9, intent);
    }
}
