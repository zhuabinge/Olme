package com.kubang.olme.activity;

import android.app.Activity;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

import com.kubang.olme.application.ExitApplication;
import com.kubang.olme.asyncTask.ImageLoadTask;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Bingo on 2014/8/12.
 * 订单详情
 */
@EActivity(R.layout.activity_orderdetail)
public class OrderDetailActivity extends Activity {
    @AfterViews
   void init(){
        ExitApplication.getInstance().addActivity(this);
        Intent intent = getIntent();

        //TODO根据selectId获取item详细信息
        HashMap<String,Object> itemData = (HashMap<String,Object>)intent.getSerializableExtra("itemData");
        //设置控件显示的内容
        ((TextView)this.findViewById(R.id.orderIdD)).setText(itemData.get("getOrderId").toString());
        ((TextView)this.findViewById(R.id.orderDateD)).setText(itemData.get("getOrderDate").toString());
        ((TextView)this.findViewById(R.id.coursePriceD)).setText(itemData.get("getCoursePrice").toString());
        //加载图片
        loadImage((ImageView)this.findViewById(R.id.coursePhotoD),"http://192.168.137.253:8086/ForPicture/bg.jpg");
//        ((TextView)this.findViewById(R.id.acutalPriceD)).setText(itemData.get("getActualPrice").toString());
//        ((TextView)this.findViewById(R.id.userScoreD)).setText(itemData.get("getConsumeScore").toString());
    }

    /**
     * 异步加载图片
     * @param imageView 图片容器
     * @param path 图片路径
     */
    private void loadImage(ImageView imageView,String path){
        //设置图片容器，异步加载图片
        ImageLoadTask loadImageAsync = new ImageLoadTask(imageView);
        //执行异步加载，传递图片路径
        loadImageAsync.execute(path);
    }
}
