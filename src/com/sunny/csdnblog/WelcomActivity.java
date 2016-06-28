package com.sunny.csdnblog;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.content.Intent;

import android.view.View;

public class WelcomActivity extends Activity{
	
	private Handler mHandler;
	private Titanic titanic;
	private TitanicTextView titanicTextView;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.welcom_layout);
		//TitanicË®ÂþÐ§¹û
		titanicTextView = (TitanicTextView)findViewById(R.id.welcomImage);
		titanic = new Titanic();
		titanic.start(titanicTextView);
		
		mHandler = new Handler();
		//TextView welcomTextView = (TextView)findViewById(R.id.welcomImage);
		//TextView madebyTextView = (TextView)findViewById(R.id.madeby);
		View welcomView = (View)findViewById(R.id.welcom_layout);
		
		Animation animation = AnimationUtils.loadAnimation(this, R.anim.welcom_anim);
		animation.setAnimationListener(new AnimationListener(){

			@Override
			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onAnimationEnd(Animation animation) {
				// TODO Auto-generated method stub
				mHandler.post(new Runnable(){

					@Override
					public void run() {
						// TODO Auto-generated method stub
						Intent intent = new Intent(WelcomActivity.this,MainActivity.class);
						startActivity(intent);
						WelcomActivity.this.finish();
					}
					
				});
			}

			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		welcomView.startAnimation(animation);
		//madebyTextView.startAnimation(animation);
	}

}
