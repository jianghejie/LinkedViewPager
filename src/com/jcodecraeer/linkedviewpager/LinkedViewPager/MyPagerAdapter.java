package com.jcodecraeer.linkedviewpager.LinkedViewPager;

import java.util.ArrayList;

import android.os.Parcelable;
import android.view.View;

public class MyPagerAdapter extends PagerAdapter {

	private ArrayList<View> mPageViews;

	public MyPagerAdapter(ArrayList<View> mPageViews) {
		super();
		this.mPageViews = mPageViews;
	}

	@Override
	public int getCount() {
		return mPageViews.size();
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		return arg0 == arg1;
	}

	@Override
	public int getItemPosition(Object object) {
		// TODO Auto-generated method stub
		return super.getItemPosition(object);
	}

	@Override
	public void destroyItem(View arg0, int arg1, Object arg2) {
		// TODO Auto-generated method stub
		((ViewPager) arg0).removeView(mPageViews.get(arg1));
	}

	@Override
	public Object instantiateItem(View arg0, int arg1) {
		// TODO Auto-generated method stub
		((ViewPager) arg0).addView(mPageViews.get(arg1));
		return mPageViews.get(arg1);
	}

	@Override
	public void restoreState(Parcelable arg0, ClassLoader arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public Parcelable saveState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void startUpdate(View arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void finishUpdate(View arg0) {
		// TODO Auto-generated method stub

	}

}