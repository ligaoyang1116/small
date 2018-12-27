package com.gy.mymvp_dome1.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.gy.mymvp_dome1.R;
import com.gy.mymvp_dome1.bean.LgyBean;

import java.util.ArrayList;
import java.util.List;

public class HomelistAdapter extends BaseAdapter {
    Context context;
    ArrayList<LgyBean.ResultBean.RxxpBean> list;
    private TextView t1;

    public HomelistAdapter(Context context,ArrayList<LgyBean.ResultBean.RxxpBean> list) {
        this.context = context;
        this.list=list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if (convertView==null){
            holder=new ViewHolder();
            t1 = holder.tee1 = convertView.findViewById(R.id.t1);
            convertView.setTag(holder);
        }else{
            holder= (ViewHolder) convertView.getTag();
        }
        t1.setText(list.get(position).getName());
        return convertView;
    }
    class ViewHolder{
        ImageView imgee;
        TextView tee1;
    }
}
