package com.kubang.olme.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.kubang.olme.PopupWindow.MorePopWindow;
import com.kubang.olme.adapter.MyCollectionAdapter;
import com.kubang.olme.application.ExitApplication;
import com.kubang.olme.asyncTask.CheckThemeGetDataTask;
import com.kubang.olme.asyncTask.QuestionGetDatTask;
import com.kubang.olme.dataSource.CheckThemeData;
import com.kubang.olme.dataSource.ListViewData;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Bingo on 2014/8/18.
 *
 * 查看消息的主题
 */
@EActivity(R.layout.activity_checktheme)
public class CheckThemeActivity extends Activity {

    @ViewById(R.id.morebt)
    ImageView morebt;


    private PullToRefreshListView pullToRefreshListView;
    private SimpleAdapter adapter;
    private SimpleAdapter adapter1;

    private CheckThemeData data;

    private ListViewData data1;
    private LinkedList<HashMap<String,Object>> list;
//    private LinkedList<HashMap<String,Object>> listview;
    private LayoutInflater inflater;
    private View views;


    @AfterViews
    void init(){
        ExitApplication.getInstance().addActivity(this);
        list =data.getDataSource();
//        listview = data1.getDataSource();

        inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        views = inflater.inflate(    //获取自定义布局文件dialog.xml的视图
                R.layout.activity_login, null, false);

        pullToRefreshListView = (PullToRefreshListView)this.findViewById(R.id.checkThemeList);  //下拉刷新
//        ListView testListView = (ListView)this.findViewById(R.id.comContent);

        pullToRefreshListView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener<ListView>() {
            @Override
            public void onRefresh(PullToRefreshBase<ListView> refreshView) {
                String label = DateUtils.formatDateTime(getApplicationContext(), System.currentTimeMillis(),
                        DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_ABBREV_ALL);

                // Update the LastUpdatedLabel
                refreshView.getLoadingLayoutProxy().setLastUpdatedLabel(label);

                // Do work to refresh the list here.
                //
                new QuestionGetDatTask(list,pullToRefreshListView,adapter).execute();
            }
        });

//        adapter1 = new SimpleAdapter(this,listview,R.layout.item_testlistview,new String[] {"id","dd"},new int[]{R.id.testlistview,R.id.testlistview1});

        adapter = new SimpleAdapter(this, list, R.layout.item_checktheme,
                new String[] { "list"},
                new int[] { R.id.comContent});

//        testListView.setAdapter(adapter1);

        ListView actualListView = pullToRefreshListView.getRefreshableView();
        actualListView.setAdapter(adapter);
    }


    @Click(R.id.returnbt)
    void returnbtIsClick() {
        CheckThemeActivity.this.finish();  //结束本Activity
    }


    @Click(R.id.morebt)
    void morebtIsClick() {
        MorePopWindow morePopWindow = new MorePopWindow(CheckThemeActivity.this, views);
        morePopWindow.showPopupWindow(morebt);  //显示more窗口
    }
}
