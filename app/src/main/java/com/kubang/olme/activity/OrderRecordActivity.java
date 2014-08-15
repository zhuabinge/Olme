package com.kubang.olme.activity;

import android.app.Activity;
import android.text.format.DateUtils;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.kubang.olme.application.ExitApplication;
import com.kubang.olme.asyncTask.GetDataTask;
import com.kubang.olme.asyncTask.OrderGetDataTask;
import com.kubang.olme.dataSource.OrderRecordData;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

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

    @AfterViews
    void init(){
        ExitApplication.getInstance().addActivity(this);
        list =data.getDataSource();
        headTitle.setText("订单记录");  //设置标题
        pullToRefreshListView = (PullToRefreshListView)this.findViewById(R.id.orderList);  //下拉刷新
        pullToRefreshListView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener<ListView>() {
            @Override
            public void onRefresh(PullToRefreshBase<ListView> refreshView) {
                String label = DateUtils.formatDateTime(getApplicationContext(), System.currentTimeMillis(),
                        DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_ABBREV_ALL);

                // Update the LastUpdatedLabel
                refreshView.getLoadingLayoutProxy().setLastUpdatedLabel(label);

                // Do work to refresh the list here.
                new OrderGetDataTask(list,pullToRefreshListView,adapter).execute();
            }
        });

        adapter = new SimpleAdapter(this, list, R.layout.item_orderrecord,
                new String[] { "orderId", "username", "phone", "address" },
                new int[] { R.id.orderId, R.id.courseName, R.id.coursePrice, R.id.orderDate });

        ListView actualListView = pullToRefreshListView.getRefreshableView();
        actualListView.setAdapter(adapter);
    }
}
