package com.kubang.olme.activity;

import android.app.Activity;
import android.content.Intent;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.kubang.olme.application.ExitApplication;
import com.kubang.olme.asyncTask.AnswerGetDataTask;
import com.kubang.olme.dataSource.AnswerData;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Bingo on 2014/8/18.
 */
@EActivity(R.layout.activity_answerdetail)
public class MessageDetailActivity extends Activity {

    private PullToRefreshListView pullToRefreshListView;
    private SimpleAdapter adapter;
    private AnswerData data;
    private LinkedList<HashMap<String,Object>> list;

    @AfterViews
    void init() {
        ExitApplication.getInstance().addActivity(this);
        list = data.getDataSource();
        pullToRefreshListView = (PullToRefreshListView) this.findViewById(R.id.answerList);  //下拉刷新
        pullToRefreshListView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener<ListView>() {
            @Override
            public void onRefresh(PullToRefreshBase<ListView> refreshView) {
                String label = DateUtils.formatDateTime(getApplicationContext(), System.currentTimeMillis(),
                        DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_ABBREV_ALL);

                // Update the LastUpdatedLabel
                refreshView.getLoadingLayoutProxy().setLastUpdatedLabel(label);

                // Do work to refresh the list here.
                new AnswerGetDataTask(list, pullToRefreshListView, adapter).execute();
            }
        });

        adapter = new SimpleAdapter(this, list, R.layout.item_answer,
                new String[]{"id", "name", "vedioLength", "rating"},
                new int[]{R.id.answerUserId, R.id.answerUserName, R.id.answerDate, R.id.answerContent});

        ListView actualListView = pullToRefreshListView.getRefreshableView();
        actualListView.setAdapter(adapter);


        pullToRefreshListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(view.getContext(), SelectActivity_.class);
                startActivity(intent);
            }
        });
    }
}
