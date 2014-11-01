LinkedViewPager android
===============

a android linked ViewPager and a demo to show the effect

仿zaker最新版本引导界面的视图联动效果（修改viewpager实现）   

我们先来看看我实现的最终效果：
![](https://raw.githubusercontent.com/jianghejie/LinkedViewPager/master/screenshots/6465446.gif)  

联动ViewPager的意思就是当一个viewpager在滑动的时候，另外一个ViewPager也跟着滑动，而且两者是同步的。

如果ViewPager有关于移动距离的回调接口，这事儿就好办了，遗憾的是没有，只有一个OnPageChangeListener，我试过在OnPageChangeListener中根据onPageScrolled(int position, float positionOffset, int positionOffsetPixels)的参数来做，但是失败了。

那就只有自定义ViewPager了。

使用方法
===============
假设有一个是mViewPager，有一个是mFollowViewPager,我想让mFollowViewPager随着mViewPager动，则：
 
mPager.setFollowViewPager(mFollowViewPager);

要想查看实现原理请参考我的文章：http://jcodecraeer.com/a/anzhuokaifa/androidkaifa/2014/1031/1884.html
