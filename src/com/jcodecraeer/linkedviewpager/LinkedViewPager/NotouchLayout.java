package com.jcodecraeer.linkedviewpager.LinkedViewPager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class NotouchLayout extends RelativeLayout{ 
  
    public NotouchLayout(Context context) {  
        super(context);  
    }  
  
    public NotouchLayout(Context context, AttributeSet attrs) {  
        super(context, attrs);  
    }  
    @Override
    public boolean onTouchEvent(MotionEvent ev) {
    	return false;
    }
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
    	return true;
    }
   
}  