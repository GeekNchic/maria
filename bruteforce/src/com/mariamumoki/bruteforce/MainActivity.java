package com.mariamumoki.bruteforce;

import android.os.Bundle;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener {
	
	private Button textButton;
	private Button picsButton;
	private Button vidsButton;
	private Button ispButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	 textButton = (Button)findViewById(R.id.btn_text);
	picsButton = (Button)findViewById(R.id.btn_pictures);
	vidsButton = (Button)findViewById(R.id.btn_videos);
	ispButton = (Button)findViewById(R.id.btn_isps);
	
	
	textButton.setOnClickListener(this);
	picsButton.setOnClickListener(this);
	vidsButton.setOnClickListener(this);
	ispButton.setOnClickListener(this);
	
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(v.equals(textButton))
		{
		Intent textIntent = new Intent(MainActivity.this, Text.class);
		startActivity(textIntent); 
		}
		
		if(v.equals(picsButton))
		{
		Intent textIntent = new Intent(MainActivity.this, Pictures.class);
		startActivity(textIntent); 
		}
		if(v.equals(vidsButton))
		{
		Intent textIntent = new Intent(MainActivity.this, Videos.class);
		startActivity(textIntent); 
		}
		if(v.equals(ispButton))
		{
		Intent textIntent = new Intent(MainActivity.this, ISPs.class);
		startActivity(textIntent); 
		}
	}

	

}
