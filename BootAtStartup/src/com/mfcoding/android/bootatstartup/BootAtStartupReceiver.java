package com.mfcoding.android.bootatstartup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootAtStartupReceiver extends BroadcastReceiver {
	static final String TAG = "BootAtStartupReceiver";
	
	@Override
	public void onReceive(Context context, Intent intent) {
		if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
			Log.d(TAG, "*** onReceive ACTION_BOOT_COMPLETED");
		}

		Log.d(TAG, "*** onReceive");
	}

}
