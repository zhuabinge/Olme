package com.kubang.olme.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.kubang.olme.activity.LoginActivity_;
import com.kubang.olme.activity.R;


/**
 * Created by Bingo on 2014/8/4.
 */

public class ClassFragment extends Fragment {
    private Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.tab2, null);
        button = (Button) view.findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getActivity(), LoginActivity_.class);
                startActivity(intent);
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
