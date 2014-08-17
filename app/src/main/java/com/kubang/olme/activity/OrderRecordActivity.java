package com.kubang.olme.activity;

import android.app.Activity;
import android.content.Intent;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.kubang.olme.application.ExitApplication;
import com.kubang.olme.asyncTask.GetDataTask;
import com.kubang.olme.asyncTask.OrderGetDataTask;
import com.kubang.olme.dataSource.OrderRecordData;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.logging.Handler;

/**
 * Created by Bingo on 2014/8/9.
 * 订单记录
 */
@EActivity(R.layout.activity_orderrecord)
public class OrderRecordActivity extends Activity {

    @ViewById(R.id.headTitle)
    TextView headTitle;

    private PullToRefreshListView pullToRefreshListView;
    private SimpleAdapter adapter;
    private OrderRecordData data;
    private LinkedList<HashMap<String,Object>> list;
    private Handler handler;
    @AfterViews
    void init(){
        ExitApplication.getInstance().addActivity(this);

        //TODO 从数据库获取数据

        list =data.getDataSource();//TODO 测试使用数据，待删除
        headTitle.setText("订单记录");  //设置标题
        pullToRefreshListView = (PullToRefreshListView)this.findViewById(R.id.orderList);  //下拉刷新
        pullToRefreshListView.setMode(PullToRefreshBase.Mode.BOTH);
        pullToRefreshListView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener<ListView>() {
            @Override
            public void onRefresh(PullToRefreshBase<ListView> refreshView) {
                if(refreshView.isHeaderShown()){

                    String label = DateUtils.formatDateTime(getApplicationContext(), System.currentTimeMillis(),
                            DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_ABBREV_ALL);

                    // Update the LastUpdatedLabel
                    refreshView.getLoadingLayoutProxy().setLastUpdatedLabel(label);

                    // Do work to refresh the list here.
                    new OrderGetDataTask(list,pullToRefreshListView,adapter,true).execute();
                }
               else {

                    new OrderGetDataTask(list,pullToRefreshListView,adapter,false).execute();
                }
            }
        });


        adapter = new SimpleAdapter(this, list, R.layout.item_orderrecord,
                new String[] { "getOrderId", "getCourseName", "getCoursePrice", "getOrderDate" },
                new int[] { R.id.orderId, R.id.courseName, R.id.coursePrice, R.id.orderDate });

        ListView actualListView = pullToRefreshListView.getRefreshableView();
        actualListView.setAdapter(adapter);
        //为pullToRefreshListView注册点击监听，并将传递点击的下标值
        pullToRefreshListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent  = new Intent(OrderRecordActivity.this,OrderDetailActivity_.class);
                //传递数据集LinkedList
                intent.putExtra("itemData",list.get(position-1));
                startActivity(intent);
            }
        });
    }

}

