package com.example.shoesstore.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.shoesstore.R;
import com.example.shoesstore.model.LoaiSp;

import java.util.List;

public class LoaiSpAdapter extends BaseAdapter {
    List<LoaiSp> array;
    Context context;

    public LoaiSpAdapter(List<LoaiSp> array, Context context) {
        this.array = array;
        this.context = context;
    }

    @Override
    public int getCount() {
        return array.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    public  class  ViewHolder{
        TextView name;
        ImageView hinhanh;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder =null;
        if (view==null){
            viewHolder = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=layoutInflater.inflate(R.layout.item_sanpham,null);
            viewHolder.name=view.findViewById(R.id.item_tensp);
            viewHolder.hinhanh=view.findViewById(R.id.item_image);
            view.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) view.getTag();
            viewHolder.name.setText(array.get(i).getName());
            Glide.with(context).load(array.get(i).getHinhanh()).into(viewHolder.hinhanh);
        }
        return view;
    }
}
