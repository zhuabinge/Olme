package com.kubang.olme.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;


import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.kubang.olme.activity.AddThemeActivity_;
import com.kubang.olme.activity.AnswerDetailActivity_;
import com.kubang.olme.activity.MyMessageActivity_;
import com.kubang.olme.activity.R;
import com.kubang.olme.asyncTask.QuestionGetDatTask;
import com.kubang.olme.dataSource.AllQuestionData;


import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Bingo on 2014/8/4.
 * app底部菜单的交流
 */
public class CommunicationFragment extends Fragment {
    private LinkedList<HashMap<String,Object>> list;
    private PullToRefreshListView pullToRefreshListView;
    private SimpleAdapter adapter;
    private AllQuestionData data;
    private TextView messageCount;
    private TextView writePanel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.tab3, null);

        list =data.getDataSource();

        pullToRefreshListView = (PullToRefreshListView) view.findViewById(R.id.themeList);

        // Set a listener to be invoked when the list should be refreshed.
        pullToRefreshListView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener<ListView>() {
            @Override
            public void onRefresh(PullToRefreshBase<ListView> refreshView) {
                String label = DateUtils.formatDateTime(getActivity().getApplicationContext(), System.currentTimeMillis(),
                        DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_ABBREV_ALL);

                // Update the LastUpdatedLabel
                refreshView.getLoadingLayoutProxy().setLastUpdatedLabel(label);

                // Do work to refresh the list here.
                new QuestionGetDatTask(list,pullToRefreshListView,adapter).execute();
            }
        });
        adapter = new SimpleAdapter(getActivity(), list, R.layout.item_question,
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

        messageCount = (TextView)view.findViewById(R.id.messageCount);
        writePanel = (TextView)view.findViewById(R.id.writePanel);

        messageCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MyMessageActivity_.class);
                startActivity(intent);
            }
        });

        writePanel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddThemeActivity_.class);
                startActivity(intent);
            }
        });

        return view;
    }

    @Override
    public void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
    }
}
