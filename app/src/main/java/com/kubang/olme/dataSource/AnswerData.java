package com.kubang.olme.dataSource;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Bingo on 2014/8/17.
 */
public class AnswerData {
    public static LinkedList<HashMap<String, Object>> getDataSource() {
        LinkedList<HashMap<String, Object>> list = new LinkedList<HashMap<String, Object>>();
        HashMap<String, Object> map1 = new HashMap<String, Object>();
        map1.put("id", "1");
        map1.put("name", "A");
        map1.put("vedioLength", "Bingo");
        map1.put("rating", "5");
        HashMap<String, Object> map2 = new HashMap<String, Object>();
        map2.put("id", "2");
        map2.put("name", "B");
        map2.put("vedioLength", "Tracy");
        map2.put("rating", "0");
        HashMap<String, Object> map3 = new HashMap<String, Object>();
        map3.put("id", "3");
        map3.put("name", "C");
        map3.put("vedioLength", "Lily");
        map3.put("rating", "5");
        HashMap<String, Object> map4 = new HashMap<String, Object>();
        map4.put("id", "4");
        map4.put("name", "D");
        map4.put("vedioLength", "Jack");
        map4.put("rating", "5");
        HashMap<String, Object> map5 = new HashMap<String, Object>();
        map5.put("id", "5");
        map5.put("name", "E");
        map5.put("vedioLength", "Bingo");
        map5.put("rating", "0");
        HashMap<String, Object> map6 = new HashMap<String, Object>();
        map6.put("id", "6");
        map6.put("name", "F");
        map6.put("vedioLength", "Tracy");
        map6.put("rating", "0");
        HashMap<String, Object> map7 = new HashMap<String, Object>();
        map7.put("id", "7");
        map7.put("name", "G");
        map7.put("vedioLength", "Bingo");
        map7.put("rating", "5");
        HashMap<String, Object> map8 = new HashMap<String, Object>();
        map8.put("id", "8");
        map8.put("name", "H");
        map8.put("vedioLength", "Tracy");
        map8.put("rating", "0");
        HashMap<String, Object> map9 = new HashMap<String, Object>();
        map9.put("id", "9");
        map9.put("name", "I");
        map9.put("vedioLength", "Lily");
        map9.put("rating", "5");
        HashMap<String, Object> map10 = new HashMap<String, Object>();
        map10.put("id", "10");
        map10.put("name", "J");
        map10.put("vedioLength", "Jack");
        map10.put("rating", "0");
        HashMap<String, Object> map11 = new HashMap<String, Object>();
        map11.put("id", "11");
        map11.put("name", "K");
        map11.put("vedioLength", "Bingo");
        map11.put("rating", "5");
        HashMap<String, Object> map12 = new HashMap<String, Object>();
        map12.put("id", "12");
        map12.put("name", "L");
        map12.put("vedioLength", "Tracy");
        map12.put("rating", "0");
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
