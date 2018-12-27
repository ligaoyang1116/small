package com.gy.mymvp_dome1.home.presenter;

import com.gy.mymvp_dome1.MainActivity;
import com.gy.mymvp_dome1.api.Api;
import com.gy.mymvp_dome1.home.model.HomeListModel;

public class HomeListPresenter implements IHomeListPresenter,HomeListModel.ModleIterface{

    MainActivity mview;
    private final HomeListModel homeListModel;

    public HomeListPresenter(MainActivity mview) {
        //初始化Model层
        homeListModel = new HomeListModel(this);
        this.mview=mview;
    }

    @Override
    public void getModleData() {
        //回调model
        homeListModel.getData(Api.SHOPLIST);
    }

    @Override
    public void LoadSuccess(String data) {
        mview.getViewData(data);
    }

    @Override
    public void LoadFailed() {
        mview.getViewData("加载失败....");
    }
}
