package com.kubang.olme.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.kubang.olme.application.ExitApplication;
import com.kubang.olme.dataSource.DataSource;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.HashMap;
import java.util.Objects;

/**
 * Created by Bingo on 2014/8/3.
 */
@EActivity(R.layout.activity_homeiteminfo)
public class ItemInfoActivity extends Activity{
    @ViewById(R.id.itemIndex)
    TextView itemIndex;

    @ViewById(R.id.itemPhoto)
    ImageView itemPhoto;

    @ViewById(R.id.itemName)
    TextView itemName;

    @ViewById(R.id.itemPhone)
    TextView itemPhone;

    @Bean
    DataSource data;

    @Click(R.id.returnbt)
    void buttionIsClick(){
        ItemInfoActivity.this.finish();
    }


    @AfterViews
    void ShowInfo(){
        ExitApplication.getInstance().addActivity(this);
        Intent intent = getIntent();
        int index = intent.getIntExtra("itemIndex", 0);
        System.out.println("-------->   " + index);
        int size =data.getDataSource().size();
        HashMap<String,Object> map = data.getDataSource().get(index);
        itemIndex.setText("" + index);

        itemName.setText(map.get("username").toString());
        itemPhone.setText(map.get("phone").toString());
        itemPhoto.setImageResource((Integer)map.get("img"));
    }
}
