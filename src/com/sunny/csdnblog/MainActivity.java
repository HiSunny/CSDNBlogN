package com.sunny.csdnblog;

//import com.astuetz.PagerSlidingTabStrip;
//import com.sunny.fragments.MainFragment;
//import com.sunny.fragments.MyFragment;
//import com.sunny.fragments.OthersFragment;
//import com.sunny.fragments.TranslateFragment;

import android.os.Bundle;

//import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentPagerAdapter;
//import android.support.v4.view.ViewPager;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends FragmentActivity {

	private WebView webView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		
		webView = (WebView)findViewById(R.id.webView);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.setWebViewClient(new WebViewClient());
		webView.loadUrl("http://blog.csdn.net/doudoulee_blog");
		
		/*ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
		viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
		PagerSlidingTabStrip tabs = (PagerSlidingTabStrip)findViewById(R.id.pagerSlidingTabStrip);
		tabs.setViewPager(viewPager);
	}
	
	class MyPagerAdapter extends FragmentPagerAdapter{

		String[] title = {"首页","原创","译文","转载"};
		MainFragment mMainFragment;
		MyFragment mMyFragment;
		OthersFragment mOthersFragment;
		TranslateFragment mTranslateFragment;
		
		public MyPagerAdapter(FragmentManager fm) {
			super(fm);
			// TODO Auto-generated constructor stub
		}

		@Override
		public Fragment getItem(int position) {
			// TODO Auto-generated method stub
			switch(position){
			case 0:
				mMainFragment = new MainFragment();
				return mMainFragment;
			case 1:
				mMyFragment = new MyFragment();
				return mMyFragment;
			case 2:
				mOthersFragment = new OthersFragment();
				return mOthersFragment;
			case 3:
				mTranslateFragment = new TranslateFragment();
				return mTranslateFragment;
			default:
					return null;
			}
			
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return title.length;
		}
		 @Override    
	     public CharSequence getPageTitle(int position) {    
	         return title[position];    
	        } */
		
	}

	
}
