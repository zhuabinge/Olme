package com.kubang.olme.asyncTask;

import android.os.AsyncTask;
import android.widget.SimpleAdapter;

import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.kubang.olme.adapter.MyCollectionAdapter;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Bingo on 2014/8/16.
 */
public class CollectionGetDataTask extends AsyncTask<Void, Void, HashMap<String, Object>>{
    private LinkedList<HashMap<String, Object>> list;
    private PullToRefreshListView pullToRefreshListView;
    private MyCollectionAdapter adapter;

    public CollectionGetDataTask(LinkedList<HashMap<String, Object>> list, PullToRefreshListView pullToRefreshListView, MyCollectionAdapter adapter) {
        this.list = list;
        this.pullToRefreshListView = pullToRefreshListView;
        this.adapter = adapter;
    }

    //后台处理部分
    @Override
    protected HashMap<String, Object> doInBackground(Void... params) {
        // Simulates a background job.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("id","199101");
        map.put("name", "Jordan");
        map.put("vedioLength", "1010101");
        map.put("rating", "5");
        System.out.println("refresh0");
        System.out.println(list.size());
        return map;
    }

    //这里是对刷新的响应，可以利用addFirst（）和addLast()函数将新加的内容加到LISTView中
    //根据AsyncTask的原理，onPostExecute里的result的值就是doInBackground()的返回值
    @Override
    protected void onPostExecute(HashMap<String, Object> result) {
        //在头部增加新添内容
        list.addFirst(result);

        //通知程序数据集已经改变，如果不做通知，那么将不会刷新mListItems的集合
        adapter.notifyDataSetChanged();
        // Call onRefreshComplete when the list has been refreshed.
        pullToRefreshListView.onRefreshComplete();
        System.out.println("refresh1");
        System.out.println(list.size());
        super.onPostExecute(result);
    }
}
