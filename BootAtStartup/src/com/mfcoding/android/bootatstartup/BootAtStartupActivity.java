package com.mfcoding.android.bootatstartup;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class BootAtStartupActivity extends Activity {
	static final String TAG = "BootAtStartupActivity";
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.d(TAG, "onCreate");
    }
}