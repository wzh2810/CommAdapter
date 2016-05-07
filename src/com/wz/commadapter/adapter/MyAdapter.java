package com.wz.commadapter.adapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

import com.wz.commadapter.R;
import com.wz.commadapter.bean.Bean;
import com.wz.commadapter.holder.ViewHolder;

public class MyAdapter extends CommonAdapter<Bean> {

	public MyAdapter(Context context, List<Bean> datas, int layoutId) {
		super(context, datas, layoutId);

	}

	@Override
	public void convert(ViewHolder viewHolder, final Bean bean) {
		viewHolder.setText(R.id.tv_title, bean.getTitle()).setText(R.id.tv_desc, bean.getDesc())
				.setText(R.id.tv_time, bean.getTime()).setText(R.id.tv_phone, bean.getPhone());
		
		final CheckBox cBox = (CheckBox)(viewHolder.getView(R.id.cb));
		if (cBox != null)
		{
			cBox.setChecked(bean.isChecked());

			cBox.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					bean.setChecked(cBox.isChecked());
				}
			});
		}
	}

}
