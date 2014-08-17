package com.kubang.olme.asyncTask;

import android.os.AsyncTask;
import android.widget.SimpleAdapter;

import com.handmark.pulltorefresh.library.PullToRefreshListView;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Bingo on 2014/8/15.
 * 异步实现listview下拉更新
 */
public class OrderGetDataTask extends AsyncTask<Void, Void, HashMap<String, Object>> {
    private LinkedList<HashMap<String, Object>> list;
    private PullToRefreshListView pullToRefreshListView;
    private SimpleAdapter adapter;
    private boolean isHead;

    public OrderGetDataTask(LinkedList<HashMap<String, Object>> list, PullToRefreshListView pullToRefreshListView, SimpleAdapter adapter,boolean isHead) {
        this.list = list;
        this.pullToRefreshListView = pullToRefreshListView;
        this.adapter = adapter;
        this.isHead = isHead;
    }

    //后台处理部分
    @Override
    protected HashMap<String, Object> doInBackground(Void... params) {
        // Simulates a background job.
        //TODO 从数据库获取数据
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        //列表显示到最顶端，执行下拉更新

        HashMap<String, Object> map = new HashMap<String, Object>();
        if(this.isHead){
            map.put("getOrderId","199101");
            map.put("getCourseName", "Jordan");
            map.put("getCoursePrice", "1010101");
            map.put("getOrderDate", "testse");
            System.out.println("refresh0");
            System.out.println(list.size());

        }
        //列表显示到最底端，执行上拉更新
        else{
            map.put("getOrderId","199101");
            map.put("getCourseName", "Jordan");
            map.put("getCoursePrice", "1010101");
            map.put("getOrderDate", "testse");
            System.out.println("refresh0");
            System.out.println(list.size());
        }
        return map;
    }

    //这里是对刷新的响应，可以利用addFirst（）和addLast()函数将新加的内容加到LISTView中
    //根据AsyncTask的原理，onPostExecute里的result的值就是doInBackground()的返回值
    @Override
    protected void onPostExecute(HashMap<String, Object> result) {
        //下拉更新，在头部增加新添内容
        if(this.isHead){
            list.addFirst(result);
        }else{
            list.addLast(result);
        }


        //通知程序数据集已经改变，如果不做通知，那么将不会刷新mListItems的集合
        adapter.notifyDataSetChanged();
        // Call onRefreshComplete when the list has been refreshed.
        pullToRefreshListView.onRefreshComplete();
        System.out.println("refresh1");
        System.out.println(list.size());
        super.onPostExecute(result);
    }
}
