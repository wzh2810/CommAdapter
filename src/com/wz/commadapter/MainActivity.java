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
	 * ��ʼ�����ݺ�������
	 */
	private void initDatas() {
		mDatas = new ArrayList<Bean>();
		Bean bean = new Bean("Android�¼��� Get 1", "Android-�������ܵ�ListView��GridView������", "2016-05-07", "10086");
		mDatas.add(bean);
		bean = new Bean("Android�¼��� Get 2", "Android-�������ܵ�ListView��GridView������", "2016-05-07", "10086");
		mDatas.add(bean);
		bean = new Bean("Android�¼��� Get 3", "Android-�������ܵ�ListView��GridView������", "2016-05-07", "10086");
		mDatas.add(bean);
		bean = new Bean("Android�¼��� Get 4", "Android-�������ܵ�ListView��GridView������", "2016-05-07", "10086");
		mDatas.add(bean);
		bean = new Bean("Android�¼��� Get 5", "Android-�������ܵ�ListView��GridView������", "2016-05-07", "10086");
		mDatas.add(bean);
		
		bean = new Bean("Android�¼��� Get 6", "Android-�������ܵ�ListView��GridView������", "2016-05-07", "10086");
		mDatas.add(bean);
		bean = new Bean("Android�¼��� Get 7", "Android-�������ܵ�ListView��GridView������", "2016-05-07", "10086");
		mDatas.add(bean);
		bean = new Bean("Android�¼��� Get 8", "Android-�������ܵ�ListView��GridView������", "2016-05-07", "10086");
		mDatas.add(bean);
		bean = new Bean("Android�¼��� Get 9", "Android-�������ܵ�ListView��GridView������", "2016-05-07", "10086");
		mDatas.add(bean);
		
		bean = new Bean("Android�¼��� Get 10", "Android-�������ܵ�ListView��GridView������", "2016-05-07", "10086");
		mDatas.add(bean);
		bean = new Bean("Android�¼��� Get 11", "Android-�������ܵ�ListView��GridView������", "2016-05-07", "10086");
		mDatas.add(bean);
		bean = new Bean("Android�¼��� Get 12", "Android-�������ܵ�ListView��GridView������", "2016-05-07", "10086");
		mDatas.add(bean);
		bean = new Bean("Android�¼��� Get 13", "Android-�������ܵ�ListView��GridView������", "2016-05-07", "10086");
		mDatas.add(bean);
		
		mAdapter = new MyAdapter(MainActivity.this, mDatas, R.layout.item);
	}


	private void initView() {
		mListView = (ListView) findViewById(R.id.listView);
		mListView.setAdapter(mAdapter);
	}

	

}
