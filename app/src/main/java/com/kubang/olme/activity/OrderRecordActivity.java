package com.kubang.olme.activity;

import android.app.Activity;
import android.text.format.DateUtils;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.kubang.olme.application.ExitApplication;
import com.kubang.olme.asyncTask.GetDataTask;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by Bingo on 2014/8/9.
 */
@EActivity(R.layout.activity_orderrecord)
public class OrderRecordActivity extends Activity {
    private PullToRefreshListView pullToRefreshListView;
    private SimpleAdapter adapter;

    @AfterViews
    void init(){
        ExitApplication.getInstance().addActivity(this);
        pullToRefreshListView = (PullToRefreshListView)this.findViewById(R.id.orderList);
//        pullToRefreshListView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener<ListView>() {
//            @Override
//            public void onRefresh(PullToRefreshBase<ListView> refreshView) {
//                String label = DateUtils.formatDateTime(getApplicationContext(), System.currentTimeMillis(),
//                        DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_ABBREV_ALL);
//
//                // Update the LastUpdatedLabel
//                refreshView.getLoadingLayoutProxy().setLastUpdatedLabel(label);
//
//                // Do work to refresh the list here.
//                new GetDataTask(mListItems,mPullRefreshListView,mAdapter).execute();
//            }
//        });
//
//        adapter = new SimpleAdapter(this, data.getDataSource(), R.layout.item,
//                new String[] { "img", "username", "phone", "address" },
//                new int[] { R.id.img, R.id.username, R.id.phone, R.id.address });
    }
}
