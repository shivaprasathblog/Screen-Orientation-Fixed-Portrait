package com.example.screenorientationfixedpotrait;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//Add this code in Manifest for fixed portrait mode irrespective of the phone orientation 
		/** android:screenOrientation="portrait" **/
	    Toast.makeText(this, "It is in fixed portrait mode , code for fixed potrait is in Mainfest", Toast.LENGTH_SHORT).show();
	}

	

}
