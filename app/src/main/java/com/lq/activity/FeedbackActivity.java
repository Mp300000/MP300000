package com.lq.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.analytics.tracking.android.EasyTracker;
import com.lq.util.Constant;
import com.lq.xpressmusic.R;
import com.umeng.analytics.MobclickAgent;

/**
 * @author lq 2013-6-1 
 * */
public class FeedbackActivity extends FragmentActivity implements
		OnClickListener {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.feedback);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
