package com.mfcoding.android.bootatstartup;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class NewActivity extends Activity {
	static final String TAG = "NewActivity";
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView tv = (TextView) findViewById(R.id.text);
        tv.setText(TAG);
        
        Log.d(TAG, "onCreate");
    }
}
