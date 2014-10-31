package com.jcodecraeer.linkedviewpager;

import java.util.ArrayList;

import com.jcodecraeer.linkedviewpager.LinkedViewPager.MyPagerAdapter;
import com.jcodecraeer.linkedviewpager.LinkedViewPager.ViewPager;
 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class UserGuideActivity extends Activity {
	private ViewPager mPager;
	private ArrayList<View> mPageViews;
	private MyPagerAdapter mPageAdapter;
	
	private ViewPager mFramePager;
	private ArrayList<View> mFramePageViews;
	private MyPagerAdapter mFramePageAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_viewpager_slash);
		initViewPager();


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void initViewPager(){
		
      	mPager = (ViewPager)findViewById(R.id.pager);
      	mFramePager = (ViewPager)findViewById(R.id.main_scrolllayout);
      	
      	mPageViews = new ArrayList<View>();
      	mFramePageViews = new ArrayList<View>();
      	
      	LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
      	
      	View frameView1 = inflater.inflate(R.layout.transparent_layer_image, null);
      	initFramePagerView(frameView1 ,R.drawable.frame_view1);
      	View frameView2 = inflater.inflate(R.layout.transparent_layer_image, null);
      	initFramePagerView(frameView2 ,R.drawable.frame_view2);
      	View frameView3 = inflater.inflate(R.layout.transparent_layer_image, null);
      	initFramePagerView(frameView3 ,R.drawable.frame_view3);
      	View frameView4 = inflater.inflate(R.layout.transparent_layer_image, null);
      	initFramePagerView(frameView4 ,R.drawable.frame_view4);
      	View frameView5 = inflater.inflate(R.layout.transparent_layer_image, null);
      	initFramePagerView(frameView5 ,R.drawable.frame_view5);
      	mFramePageViews.add(frameView1);
      	mFramePageViews.add(frameView2);
      	mFramePageViews.add(frameView3);
      	mFramePageViews.add(frameView4);
      	mFramePageViews.add(frameView5);
      	
      	mFramePageAdapter = new MyPagerAdapter(mFramePageViews);
      	mFramePager.setAdapter(mFramePageAdapter);
//      	mFramePager.setOnPageChangeListener(mFramePagerListener);
  		View view1 = inflater.inflate(R.layout.transparent_layer, null);
  		initPagerView(view1,"圆天盖着大海");
  		View view2 = inflater.inflate(R.layout.transparent_layer, null);
  		initPagerView(view2,"黑水托着孤舟");
  		View view3 = inflater.inflate(R.layout.transparent_layer, null);
  		initPagerView(view3,"也看不见山");
  		View view4 = inflater.inflate(R.layout.transparent_layer, null);
  		initPagerView(view4,"那天边只有云头");
  		View view5 = inflater.inflate(R.layout.transparent_layer, null);
  		TextView textView5 = (TextView)view5.findViewById(R.id.text);
  		textView5.setVisibility(View.GONE);
  		Button btn = (Button)view5.findViewById(R.id.button);
  		btn.setVisibility(View.VISIBLE);
  		btn.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View view){
				Begin();
			}
		});
  		
  		mPageViews.add(view1);
  		mPageViews.add(view2);
  		mPageViews.add(view3);
  		mPageViews.add(view4);
  		mPageViews.add(view5);
  		mPageAdapter =new MyPagerAdapter(mPageViews);
        mPager.setAdapter(mPageAdapter);
        mPager.setFollowViewPager(mFramePager);
       // mPager.setOnPageChangeListener();

	}
	public void initFramePagerView(View frameView ,int drawable){
		ImageView image = (ImageView)frameView.findViewById(R.id.image);
		image.setImageResource(drawable);
 
	}
	public void initPagerView(View view ,String text){
  		TextView textView1 = (TextView)view.findViewById(R.id.text);
  		textView1.setText(text);
	}
	public void Begin() {
		 
		finish();
 
	}

}
