package com.gy.mymvp_dome1.home.model;

import com.google.gson.Gson;
import com.gy.mymvp_dome1.MainActivity;
import com.gy.mymvp_dome1.adapter.HomelistAdapter;
import com.gy.mymvp_dome1.bean.LgyBean;
import com.gy.mymvp_dome1.home.presenter.HomeListPresenter;
import com.gy.mymvp_dome1.netWork.MyTask;

import java.util.ArrayList;
import java.util.List;

public class HomeListModel implements IHomeListModel{

    ModleIterface modleIterface;
    public HomeListModel(HomeListPresenter modleIterface) {
        this.modleIterface=modleIterface;
    }

    @Override
    public void getData(String url) {
        //数据MyTask
        new MyTask<String>(url,"GET").setTaskListener(new MyTask.TaskListeners() {
            @Override
            public void result(String t) {
                if (t!=null){
                    modleIterface.LoadSuccess(t);
                }else{
                    modleIterface.LoadFailed();
                }
            }
        }).execute();
    }
    //定义接口 接口回调
    public interface ModleIterface{
        //获取数据状态回调的接口
        void LoadSuccess(String data);
        void LoadFailed();
    }
}
