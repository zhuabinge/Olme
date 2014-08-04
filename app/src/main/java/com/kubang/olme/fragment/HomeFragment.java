package com.kubang.olme.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.kubang.olme.activity.R;
import com.kubang.olme.dataSource.DataSource;

import org.androidannotations.annotations.Bean;

/**
 * Created by Bingo on 2014/8/4.
 */
public class HomeFragment extends Fragment{
    private SimpleAdapter adapter;
    private DataSource data;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.tab1, null);
        ListView listView1 = (ListView) view.findViewById(R.id.listview);
        adapter = new SimpleAdapter(getActivity(), data.getDataSource(), R.layout.item,
                new String[] { "img", "username", "phone", "address" },
                new int[] { R.id.img, R.id.username, R.id.phone, R.id.address });
        listView1.setAdapter(adapter);
        return view;
    }

    @Override
    public void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
    }
}
