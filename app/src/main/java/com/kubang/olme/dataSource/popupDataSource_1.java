package com.kubang.olme.dataSource;

import com.kubang.olme.activity.R;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * Created by Bingo on 2014/8/5.
 */
public class popupDataSource_1 {
    public static List<HashMap<String, Object>> getData_1() {
        List<HashMap<String, Object>> list =new ArrayList<HashMap < String, Object>>();
        HashMap<String, Object> map1 = new HashMap<String, Object>();
        map1.put("popupimage", R.drawable.defalt_head);
        map1.put("popuptext", "Bingo");
        HashMap<String, Object> map2 = new HashMap<String, Object>();
        map2.put("popupimage", R.drawable.ofm_setting_icon);
        map2.put("popuptext", "设置");
        HashMap<String, Object> map3 = new HashMap<String, Object>();
        map3.put("popupimage", R.drawable.ofm_blacklist_icon);
        map3.put("popuptext", "退出");
        list.add(map1);
        list.add(map2);
        list.add(map3);
        return list;
    }

    public static List<HashMap<String, Object>> getData_2() {
        List<HashMap<String, Object>> list =new ArrayList<HashMap < String, Object>>();
        HashMap<String, Object> map1 = new HashMap<String, Object>();
        map1.put("popupimage", R.drawable.default_login);
        map1.put("popuptext", "登陆");
        HashMap<String, Object> map2 = new HashMap<String, Object>();
        map2.put("popupimage", R.drawable.default_about);
        map2.put("popuptext", "关于");
        HashMap<String, Object> map3 = new HashMap<String, Object>();
        map3.put("popupimage", R.drawable.ofm_blacklist_icon);
        map3.put("popuptext", "退出");
        list.add(map1);
        list.add(map2);
        list.add(map3);
        return list;
    }
}
