package com.kubang.olme.activity;

import android.app.Activity;
import android.content.Intent;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.kubang.olme.application.ExitApplication;
import com.kubang.olme.asyncTask.QuestionGetDatTask;
import com.kubang.olme.dataSource.MyQuestionData;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Bingo on 2014/8/9.
 * 我发布过的主题
 */
@EActivity(R.layout.activity_myquestion)
public class MyQuestionActivity extends Activity {
//    ExitApplication.getInstance().addActivity(this);


    @ViewById(R.id.headTitle)
    TextView headTitle;

    private PullToRefreshListView pullToRefreshListView;
    private SimpleAdapter adapter;
    private MyQuestionData data;
    private LinkedList<HashMap<String,Object>> list;


    @AfterViews
    void init(){
        ExitApplication.getInstance().addActivity(this);
        list =data.getDataSource();
        headTitle.setText("我的提问");  //设置标题
        pullToRefreshListView = (PullToRefreshListView)this.findViewById(R.id.myQuestionList);  //下拉刷新
        pullToRefreshListView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener<ListView>() {
            @Override
            public void onRefresh(PullToRefreshBase<ListView> refreshView) {
                String label = DateUtils.formatDateTime(getApplicationContext(), System.currentTimeMillis(),
                        DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_ABBREV_ALL);

                // Update the LastUpdatedLabel
                refreshView.getLoadingLayoutProxy().setLastUpdatedLabel(label);

                // Do work to refresh the list here.
                new QuestionGetDatTask(list,pullToRefreshListView,adapter).execute();
            }
        });

        adapter = new SimpleAdapter(this, list, R.layout.item_question,
                new String[] { "id","img", "username","date", "phone", "address" ,"count"},
                new int[] { R.id.questionId, R.id.themeUserHeadPhoto, R.id.themeUserName, R.id.themeDate , R.id.themeName, R.id.themContent, R.id.themeCommentCount });

        ListView actualListView = pullToRefreshListView.getRefreshableView();
        actualListView.setAdapter(adapter);


        pullToRefreshListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(view.getContext(),AnswerDetailActivity_.class);
                startActivity(intent);
            }
        });
    }
}
