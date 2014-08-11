package com.kubang.olme.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.kubang.olme.activity.OrderRecordActivity_;
import com.kubang.olme.activity.PersonalInfoActivity_;
import com.kubang.olme.activity.R;
import com.kubang.olme.activity.ThemeActivity_;
import com.kubang.olme.activity.ShoppingCartActivity_;
import com.kubang.olme.application.CustomApplication;

import org.androidannotations.annotations.EFragment;

/**
 * Created by Bingo on 2014/8/4.
 */
@EFragment(R.layout.tab4)
public class PersonalFragment extends Fragment {
    private CustomApplication app;
    private Toast toast;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        System.out.println("————————> 初始化tretrt");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.tab4, null);

        System.out.println("————————> 初始化");


        toast = Toast.makeText(getActivity(),
                "请先登陆！", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);

        Button myshoppingcart = (Button)view.findViewById(R.id.myshoppingcar);
        Button orderrecord = (Button)view.findViewById(R.id.orderrecord);
        Button myscore = (Button)view.findViewById(R.id.mytheme);
        Button personalInfo = (Button)view.findViewById(R.id.personalInfo);


        myshoppingcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app = (CustomApplication) getActivity().getApplication();
                if ("Login".equals(app.getValue())) {
                    Intent intent = new Intent(getActivity(), ShoppingCartActivity_.class);
                    startActivity(intent);
                } else {
                    toast.show();
                }
            }
        });


       orderrecord.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               app = (CustomApplication) getActivity().getApplication();
               if ("Login".equals(app.getValue())) {
                   Intent intent = new Intent(getActivity(), OrderRecordActivity_.class);
                   startActivity(intent);
               } else {
                   toast.show();
               }
           }
       });

       myscore.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               app = (CustomApplication) getActivity().getApplication();
               if ("Login".equals(app.getValue())) {
                   Intent intent = new Intent(getActivity(), ThemeActivity_.class);
                   startActivity(intent);
               } else {
                   toast.show();
               }
           }
       });

        personalInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app = (CustomApplication) getActivity().getApplication();
                if ("Login".equals(app.getValue())) {
                    Intent intent = new Intent(getActivity(), PersonalInfoActivity_.class);
                    startActivity(intent);
                } else {
                    toast.show();
                }
            }
        });

        return view;
    }

//    @Override
//    public void onResume() {
//        super.onResume();
//    }

    @Override
    public void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
    }
}
