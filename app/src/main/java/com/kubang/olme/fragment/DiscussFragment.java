package com.kubang.olme.fragment;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.kubang.olme.activity.R;
import com.kubang.olme.asyncTask.GetDataTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Bingo on 2014/8/4.
 */
public class DiscussFragment extends Fragment {

    private String[] mStrings = {"Abbaye de Belloc", "Abbaye du Mont des Cats", "Abertam", "Abondance", "Ackawi",
            "Acorn", "Adelost", "Affidelice au Chablis", "Afuega'l Pitu", "Airag", "Airedale", "Aisy Cendre",
            "Allgauer Emmentaler", "Abbaye de Belloc", "Abbaye du Mont des Cats", "Abertam", "Abondance", "Ackawi",
            "Acorn", "Adelost", "Affidelice au Chablis", "Afuega'l Pitu", "Airag", "Airedale", "Aisy Cendre",
            "Allgauer Emmentaler"};
    private LinkedList<String> mListItems;
    private PullToRefreshListView mPullRefreshListView;
    private ArrayAdapter<String> mAdapter;

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

        mPullRefreshListView = (PullToRefreshListView) view.findViewById(R.id.themeList);

        // Set a listener to be invoked when the list should be refreshed.
        mPullRefreshListView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener<ListView>() {
            @Override
            public void onRefresh(PullToRefreshBase<ListView> refreshView) {
                String label = DateUtils.formatDateTime(getActivity().getApplicationContext(), System.currentTimeMillis(),
                        DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_ABBREV_ALL);

                // Update the LastUpdatedLabel
                refreshView.getLoadingLayoutProxy().setLastUpdatedLabel(label);

                // Do work to refresh the list here.
                new GetDataTask(mListItems,mPullRefreshListView,mAdapter).execute();
            }
        });

        mListItems = new LinkedList<String>();
        mListItems.addAll(Arrays.asList(mStrings));
        mAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, mListItems);

        //这两个绑定方法用其一
        // 方法一
//       mPullRefreshListView.setAdapter(mAdapter);
        //方法二
        ListView actualListView = mPullRefreshListView.getRefreshableView();
        actualListView.setAdapter(mAdapter);

        return view;
    }

    @Override
    public void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
    }
}
