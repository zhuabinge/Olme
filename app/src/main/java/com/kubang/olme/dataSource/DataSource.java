package com.kubang.olme.dataSource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.kubang.olme.activity.R;
import org.androidannotations.annotations.EBean;

/**
 * （测试）作为listview中item的数据源
 */

@EBean
public class DataSource {
	public static List<HashMap<String,Object>> getDataSource(){
		List<HashMap<String,Object>> list = new ArrayList<HashMap<String,Object>>();
		HashMap<String,Object> map1 = new HashMap<String,Object>();
		map1.put("img", R.drawable.face);
		map1.put("username", "Bingo");
		map1.put("phone","1234");
		map1.put("address","abc");
		HashMap<String,Object> map2 = new HashMap<String,Object>();
		map2.put("img", R.drawable.glasses);
		map2.put("username", "Tracy");
		map2.put("phone","2324");
		map2.put("address","bcd");
		HashMap<String,Object> map3 = new HashMap<String,Object>();
		map3.put("img", R.drawable.neck);
		map3.put("username", "Lily");
		map3.put("phone","3456");
		map3.put("address","cde");
		HashMap<String,Object> map4 = new HashMap<String,Object>();
		map4.put("img", R.drawable.desktop);
		map4.put("username", "Jack");
		map4.put("phone","4567");
		map4.put("address","def");
		HashMap<String,Object> map5 = new HashMap<String,Object>();
		map5.put("img", R.drawable.face);
		map5.put("username", "Bingo");
		map5.put("phone","1234");
		map5.put("address","abc");
		HashMap<String,Object> map6 = new HashMap<String,Object>();
		map6.put("img", R.drawable.glasses);
		map6.put("username", "Tracy");
		map6.put("phone","2324");
		map6.put("address","bcd");
		HashMap<String,Object> map7 = new HashMap<String,Object>();
		map7.put("img", R.drawable.face);
		map7.put("username", "Bingo");
		map7.put("phone","1234");
		map7.put("address","abc");
		HashMap<String,Object> map8 = new HashMap<String,Object>();
		map8.put("img", R.drawable.glasses);
		map8.put("username", "Tracy");
		map8.put("phone","2324");
		map8.put("address","bcd");
		HashMap<String,Object> map9 = new HashMap<String,Object>();
		map9.put("img", R.drawable.neck);
		map9.put("username", "Lily");
		map9.put("phone","3456");
		map9.put("address","cde");
		HashMap<String,Object> map10 = new HashMap<String,Object>();
		map10.put("img", R.drawable.desktop);
		map10.put("username", "Jack");
		map10.put("phone","4567");
		map10.put("address","def");
		HashMap<String,Object> map11 = new HashMap<String,Object>();
		map11.put("img", R.drawable.face);
		map11.put("username", "Bingo");
		map11.put("phone","1234");
		map11.put("address","abc");
		HashMap<String,Object> map12 = new HashMap<String,Object>();
		map12.put("img", R.drawable.glasses);
		map12.put("username", "Tracy");
		map12.put("phone","2324");
		map12.put("address","bcd");
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
