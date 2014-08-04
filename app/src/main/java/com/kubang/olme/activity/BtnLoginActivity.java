package com.kubang.olme.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by Bingo on 2014/8/3.
 */

public class BtnLoginActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button button  = (Button)MainActivity.list.get(1).findViewById(R.id.button1);
   }
    public void onClick(View v) {
        Intent intent = new Intent(this,LoginActivity_.class);
        startActivity(intent);
    }
}
