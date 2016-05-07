package com.wz.commadapter;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.wz.commadapter.adapter.CommonAdapter;
import com.wz.commadapter.adapter.MyAdapter;
import com.wz.commadapter.bean.Bean;

public class MainActivity extends Activity {
	
	private ListView mListView;
	private List<Bean>  mDatas;
	private MyAdapter mAdapter;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initDatas();
		initView();
	}


	/**
	 * 初始化数据和是配器
	 */
	private void initDatas() {
		mDatas = new ArrayList<Bean>();
		Bean bean = new Bean("Android新技能 Get 1", "Android-打造万能的ListView和GridView适配器", "2016-05-07", "10086");
		mDatas.add(bean);
		bean = new Bean("Android新技能 Get 2", "Android-打造万能的ListView和GridView适配器", "2016-05-07", "10086");
		mDatas.add(bean);
		bean = new Bean("Android新技能 Get 3", "Android-打造万能的ListView和GridView适配器", "2016-05-07", "10086");
		mDatas.add(bean);
		bean = new Bean("Android新技能 Get 4", "Android-打造万能的ListView和GridView适配器", "2016-05-07", "10086");
		mDatas.add(bean);
		bean = new Bean("Android新技能 Get 5", "Android-打造万能的ListView和GridView适配器", "2016-05-07", "10086");
		mDatas.add(bean);
		
		bean = new Bean("Android新技能 Get 6", "Android-打造万能的ListView和GridView适配器", "2016-05-07", "10086");
		mDatas.add(bean);
		bean = new Bean("Android新技能 Get 7", "Android-打造万能的ListView和GridView适配器", "2016-05-07", "10086");
		mDatas.add(bean);
		bean = new Bean("Android新技能 Get 8", "Android-打造万能的ListView和GridView适配器", "2016-05-07", "10086");
		mDatas.add(bean);
		bean = new Bean("Android新技能 Get 9", "Android-打造万能的ListView和GridView适配器", "2016-05-07", "10086");
		mDatas.add(bean);
		
		bean = new Bean("Android新技能 Get 10", "Android-打造万能的ListView和GridView适配器", "2016-05-07", "10086");
		mDatas.add(bean);
		bean = new Bean("Android新技能 Get 11", "Android-打造万能的ListView和GridView适配器", "2016-05-07", "10086");
		mDatas.add(bean);
		bean = new Bean("Android新技能 Get 12", "Android-打造万能的ListView和GridView适配器", "2016-05-07", "10086");
		mDatas.add(bean);
		bean = new Bean("Android新技能 Get 13", "Android-打造万能的ListView和GridView适配器", "2016-05-07", "10086");
		mDatas.add(bean);
		
		mAdapter = new MyAdapter(MainActivity.this, mDatas, R.layout.item);
	}


	private void initView() {
		mListView = (ListView) findViewById(R.id.listView);
		mListView.setAdapter(mAdapter);
	}

	

}
