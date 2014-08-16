package com.kubang.olme.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.kubang.olme.activity.R;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Bingo on 2014/8/16.
 */
public class MyCollectionAdapter extends BaseAdapter {
    private LayoutInflater mInflater;
    private LinkedList<HashMap<String,Object>> list;


    public MyCollectionAdapter(Context context,LinkedList<HashMap<String,Object>> list){
        this.mInflater = LayoutInflater.from(context);
        this.list = list;
    }
    public int getCount() {
        // TODO Auto-generated method stub
        return list.size();
    }
    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return 0;
    }
    //获取ListView每一行
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            holder=new ViewHolder();
            convertView = mInflater.inflate(R.layout.item_mycollection, null);
            holder.id = (TextView)convertView.findViewById(R.id.myCollectionVedioId);
            holder.name = (TextView)convertView.findViewById(R.id.myCollectionVedioName);
            holder.vedioLength = (TextView)convertView.findViewById(R.id.myCollectionVedioLength);
            holder.rating = (RatingBar) convertView.findViewById(R.id.myCollectionRatingBar);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder)convertView.getTag();
        }
        holder.id.setText((String)list.get(position).get("id"));
        holder.name.setText((String)list.get(position).get("name"));
        //Log.v("R", "R:" + (String) mData.get(position).get("rating"));
        holder.vedioLength.setText((String)list.get(position).get("length"));
        holder.rating.setRating(Float.parseFloat(list.get(position).get("rating").toString()));
        return convertView;
    }


    public final class ViewHolder{
        public TextView id;
        public TextView name;
        public TextView vedioLength;
        public RatingBar rating;
    }
}
