package com.kubang.olme.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.kubang.olme.PopupWindow.LoginTipPopWindow;
import com.kubang.olme.activity.OrderRecordActivity_;
import com.kubang.olme.activity.R;
import com.kubang.olme.activity.ScoreActivity_;
import com.kubang.olme.activity.ShoppingCartActivity_;
import com.kubang.olme.application.CustomApplication;

/**
 * Created by Bingo on 2014/8/4.
 */
public class PersonalFragment extends Fragment {
    private CustomApplication app;
    private Boolean flag,flag1;
    private Toast toast;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        System.out.println("————————> 初始化tretrt");
//        LayoutInflater inflater = getLayoutInflater(savedInstanceState);
//        View view = inflater.inflate(R.layout.tab4, null);
//        app = (CustomApplication) getActivity().getApplication();
//        if("Logout".equals(app.getValue())){
//            flag = false;
////            flag1 =
//            new LoginTipPopWindow(getActivity(),view);
//        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.tab4, null);

        System.out.println("————————> 初始化");

        Button myshoppingcar = (Button)view.findViewById(R.id.myshoppingcar);
        Button orderrecord = (Button)view.findViewById(R.id.orderrecord);
        Button myscore = (Button)view.findViewById(R.id.myscore);
//        if(flag) {
        app = (CustomApplication) getActivity().getApplication();
//            if ("Logout".equals(app.getValue())) {
//                new LoginTipPopWindow(getActivity(), view);
//            }
//        }

        toast = Toast.makeText(getActivity(),
                "请先登陆！", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);

        myshoppingcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if("Login".equals(app.getValue())){
                    Intent intent = new Intent(getActivity(), ShoppingCartActivity_.class);
                    startActivity(intent);
                }
                else{
                    toast.show();
                }
            }
        });

        orderrecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if("Login".equals(app.getValue())){
                    Intent intent = new Intent(getActivity(), OrderRecordActivity_.class);
                    startActivity(intent);
                }
                else {
                    toast.show();
                }
            }
        });

        myscore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if("Login".equals(app.getValue())){
                    Intent intent = new Intent(getActivity(), ScoreActivity_.class);
                    startActivity(intent);
                }else {
                    toast.show();
                }
            }
        });
        return view;
    }

    @Override
    public void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
    }
}
