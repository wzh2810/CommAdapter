package com.wz.commadapter.holder;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder {
	private SparseArray<View> mViews;
	private int mPosition;
	private View mConvertView;

	public View getConvertView() {
		return mConvertView;
	}

	public ViewHolder(Context context, ViewGroup parent, int layoutId, int position) {
		this.mViews = new SparseArray<View>();
		this.mPosition = position;
		this.mConvertView = LayoutInflater.from(context).inflate(layoutId, parent, false);
		this.mConvertView.setTag(this);
	}

	public static ViewHolder get(Context context, View convertView, ViewGroup parent, int layoutId, int position) {
		if(convertView == null) {
			return new ViewHolder(context, parent, layoutId, position);
		} else {
			ViewHolder viewHolder = (ViewHolder) convertView.getTag();
			viewHolder.mPosition = position;
			return viewHolder;
		}
	}
	
	/**
	 * ͨ��viewId��ÿؼ�
	 * @param viewId
	 * @return
	 */
	public <T extends View> T getView(int viewId) {
		View view = mViews.get(viewId);
		if(view == null) {
			view = mConvertView.findViewById(viewId);
			mViews.put(viewId, view);
		}
		return (T) view;
	}
	
	/**
	 * ����TextView��ֵ
	 * @param viewId
	 * @param text
	 * @return
	 */
	public ViewHolder setText(int viewId,String text) {
		TextView tv = getView(viewId);
		tv.setText(text);
		return this;
	}
	
	/**
	 * ����ͼƬ
	 * @param viewId
	 * @param resId
	 * @return
	 */
	public ViewHolder setImageResource(int viewId,int resId) {
		ImageView mIv = getView(viewId);
		mIv.setImageResource(resId);
		return this;
	}
	
	public ViewHolder setImageBitmap(int viewId,Bitmap bitmap) {
		ImageView mIv = getView(viewId);
		mIv.setImageBitmap(bitmap);
		return this;
	}
	
	public ViewHolder setImageURl(int viewId,String url) {
		ImageView mIv = getView(viewId);
		//�����������ͼƬ���ݹ���
		//mIv.setImageURI(url);
		return this;
	}

}
