package com.kubang.olme.dataSource;

import com.kubang.olme.activity.R;

import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Bingo on 2014/8/15.
 * （测试）作为listview中item的数据源
 */
public class OrderRecordData {
    public static LinkedList<HashMap<String, Object>> getDataSource() {
        LinkedList<HashMap<String, Object>> list = new LinkedList<HashMap<String, Object>>();
        HashMap<String, Object> map1 = new HashMap<String, Object>();
        map1.put("getOrderId", "2008");
        map1.put("getCourseName", "Bingo");
        map1.put("getCoursePrice", "1234");
        map1.put("getOrderDate", "abc");
        HashMap<String, Object> map2 = new HashMap<String, Object>();
        map2.put("getOrderId", "2009");
        map2.put("getCourseName", "Tracy");
        map2.put("getCoursePrice", "2324");
        map2.put("getOrderDate", "bcd");
        HashMap<String, Object> map3 = new HashMap<String, Object>();
        map3.put("getOrderId", "2010");
        map3.put("getCourseName", "Lily");
        map3.put("getCoursePrice", "3456");
        map3.put("getOrderDate", "cde");
        HashMap<String, Object> map4 = new HashMap<String, Object>();
        map4.put("getOrderId", "2012");
        map4.put("getCourseName", "Jack");
        map4.put("getCoursePrice", "4567");
        map4.put("getOrderDate", "def");
        HashMap<String, Object> map5 = new HashMap<String, Object>();
        map5.put("getOrderId", "2013");
        map5.put("getCourseName", "Bingo");
        map5.put("getCoursePrice", "1234");
        map5.put("getOrderDate", "abc");
        HashMap<String, Object> map6 = new HashMap<String, Object>();
        map6.put("getOrderId", "2014");
        map6.put("getCourseName", "Tracy");
        map6.put("getCoursePrice", "2324");
        map6.put("getOrderDate", "bcd");
        HashMap<String, Object> map7 = new HashMap<String, Object>();
        map7.put("getOrderId", "2009");
        map7.put("getCourseName", "Bingo");
        map7.put("getCoursePrice", "1234");
        map7.put("getOrderDate", "abc");
        HashMap<String, Object> map8 = new HashMap<String, Object>();
        map8.put("getOrderId", "2010");
        map8.put("getCourseName", "Tracy");
        map8.put("getCoursePrice", "2324");
        map8.put("getOrderDate", "bcd");
        HashMap<String, Object> map9 = new HashMap<String, Object>();
        map9.put("getOrderId", "2011");
        map9.put("getCourseName", "Lily");
        map9.put("getCoursePrice", "3456");
        map9.put("getOrderDate", "cde");
        HashMap<String, Object> map10 = new HashMap<String, Object>();
        map10.put("getOrderId", "2012");
        map10.put("getCourseName", "Jack");
        map10.put("getCoursePrice", "4567");
        map10.put("getOrderDate", "def");
        HashMap<String, Object> map11 = new HashMap<String, Object>();
        map11.put("getOrderId", "2013");
        map11.put("getCourseName", "Bingo");
        map11.put("getCoursePrice", "1234");
        map11.put("getOrderDate", "abc");
        HashMap<String, Object> map12 = new HashMap<String, Object>();
        map12.put("getOrderId", "2014");
        map12.put("getCourseName", "Tracy");
        map12.put("getCoursePrice", "2324");
        map12.put("getOrderDate", "bcd");
        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);
        list.add(map5);
        list.add(map6);
        list.add(map7);
        list.add(map8);
        list.add(map9);
        list.add(map10);
        list.add(map11);
        list.add(map12);
        return list;
    }
}

