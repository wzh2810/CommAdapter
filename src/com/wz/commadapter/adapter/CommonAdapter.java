package com.wz.commadapter.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.wz.commadapter.holder.ViewHolder;

public abstract class CommonAdapter<T> extends BaseAdapter {
	public Context mContext;
	public List<T> mDatas;
	public LayoutInflater mInflater;
	public int mlayoutId;
	
	public CommonAdapter(Context context,List<T> datas,int layoutId) {
		this.mContext = context;
		this.mDatas = datas;
		this.mlayoutId = layoutId;
		mInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		return mDatas.size();
	}

	@Override
	public T getItem(int position) {
		return mDatas.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder viewHolder = ViewHolder.get(mContext, convertView, parent, mlayoutId, position);
		convert(viewHolder,getItem(position));
		return viewHolder.getConvertView();
	}
	
	public abstract void convert(ViewHolder viewHolder,T t);

}
