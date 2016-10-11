package com.ztq;

import com.example.testjar.R;
import com.jarLib2.Lib2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		TextView tv = (TextView)this.findViewById(R.id.textView1);
		tv.setText(Lib2.getLib1String());
	}
}
