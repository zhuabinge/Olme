package com.kubang.olme.dataSource;

import com.kubang.olme.activity.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Bingo on 2014/8/16.
 */
public class MyQuestionData {
    public static LinkedList<HashMap<String, Object>> getDataSource() {
        LinkedList<HashMap<String, Object>> list = new LinkedList<HashMap<String, Object>>();
        HashMap<String,Object> map1 = new HashMap<String,Object>();
        map1.put("id","1");
        map1.put("img", R.drawable.face);
        map1.put("username", "Bingo");
        map1.put("date","2012");
        map1.put("phone","1234");
        map1.put("address","abc");
        map1.put("count","1");
        HashMap<String,Object> map2 = new HashMap<String,Object>();
        map2.put("id","2");
        map2.put("img", R.drawable.glasses);
        map2.put("username", "Tracy");
        map2.put("date","2011");
        map2.put("phone","2324");
        map2.put("address","bcd");
        map2.put("count","2");
        HashMap<String,Object> map3 = new HashMap<String,Object>();
        map3.put("id","3");
        map3.put("img", R.drawable.neck);
        map3.put("username", "Lily");
        map3.put("date","2010");
        map3.put("phone","3456");
        map3.put("address","cde");
        map3.put("count","3");
        HashMap<String,Object> map4 = new HashMap<String,Object>();
        map4.put("id","4");
        map4.put("img", R.drawable.desktop);
        map4.put("username", "Jack");
        map4.put("date","2009");
        map4.put("phone","4567");
        map4.put("address","def");
        map4.put("count","4");
        HashMap<String,Object> map5 = new HashMap<String,Object>();
        map5.put("id","5");
        map5.put("img", R.drawable.face);
        map5.put("username", "Bingo");
        map5.put("date","2008");
        map5.put("phone","1234");
        map5.put("address","abc");
        map5.put("count","5");
        HashMap<String,Object> map6 = new HashMap<String,Object>();
        map6.put("id","6");
        map6.put("img", R.drawable.glasses);
        map6.put("username", "Tracy");
        map6.put("date","2007");
        map6.put("phone","2324");
        map6.put("address","bcd");
        map6.put("count","6");
        HashMap<String,Object> map7 = new HashMap<String,Object>();
        map7.put("id","7");
        map7.put("img", R.drawable.face);
        map7.put("username", "Bingo");
        map7.put("date","2006");
        map7.put("phone","1234");
        map7.put("address","abc");
        map7.put("count","71");
        HashMap<String,Object> map8 = new HashMap<String,Object>();
        map8.put("id","8");
        map8.put("img", R.drawable.glasses);
        map8.put("username", "Tracy");
        map8.put("date","2005");
        map8.put("phone","2324");
        map8.put("address","bcd");
        map8.put("count","8");
        HashMap<String,Object> map9 = new HashMap<String,Object>();
        map9.put("id","9");
        map9.put("img", R.drawable.neck);
        map9.put("username", "Lily");
        map9.put("date","2004");
        map9.put("phone","3456");
        map9.put("address","cde");
        map9.put("count","9");
        HashMap<String,Object> map10 = new HashMap<String,Object>();
        map10.put("id","10");
        map10.put("img", R.drawable.desktop);
        map10.put("username", "Jack");
        map10.put("date","2003");
        map10.put("phone","4567");
        map10.put("address","def");
        map10.put("count","10");
        HashMap<String,Object> map11 = new HashMap<String,Object>();
        map11.put("id","11");
        map11.put("img", R.drawable.face);
        map11.put("username", "Bingo");
        map11.put("date","2002");
        map11.put("phone","1234");
        map11.put("address","abc");
        map11.put("count","11");
        HashMap<String,Object> map12 = new HashMap<String,Object>();
        map12.put("id","12");
        map12.put("img", R.drawable.glasses);
        map12.put("username", "Tracy");
        map12.put("date","2001");
        map12.put("phone","2324");
        map12.put("address","bcd");
        map12.put("count","12");
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