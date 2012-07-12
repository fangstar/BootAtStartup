package com.mfcoding.android.bootatstartup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * To Test: 
 * In shell terminal type: adb shell 
 * Within adb shell: am broadcast -a android.intent.action.BOOT_COMPLETED
 * 
 * @author mfang
 * 
 */

public class BootAtStartupReceiver extends BroadcastReceiver {
	static final String TAG = "BootAtStartupReceiver";

	@Override
	public void onReceive(Context context, Intent intent) {
		if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
			Log.d(TAG, "*** onReceive ACTION_BOOT_COMPLETED");

			// Start Intent or Service
			/*
			 * // Example of Intent Intent intent2 = new Intent(context,
			 * NewActivity.class);
			 * intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			 * context.startActivity(intent2);
			 */
		}

		Log.d(TAG, "*** onReceive");
	}

}
