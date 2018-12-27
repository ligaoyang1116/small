package com.gy.mymvp_dome1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.gy.mymvp_dome1.adapter.HomelistAdapter;
import com.gy.mymvp_dome1.bean.LgyBean;
import com.gy.mymvp_dome1.home.presenter.HomeListPresenter;
import com.gy.mymvp_dome1.home.view.IHomeListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements IHomeListView {

    private ListView listView;
    private HomeListPresenter homeListPresenter;
    private TextView te1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        te1 = findViewById(R.id.te1);
        //初始化presenter
        homeListPresenter = new HomeListPresenter(this);
        homeListPresenter.getModleData();
    }

    @Override
    public void getViewData(String mViewData) {
           te1.setText(mViewData);
    }
}
