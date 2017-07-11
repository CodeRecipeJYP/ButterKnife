package com.asuscomm.yangyinetwork.myfragment_170710;

import android.app.Application;
import android.util.Log;

/**
 * Created by jaeyoung on 7/11/17.
 */

public class GlobalApplication extends Application {
    private static final String TAG = "jaeyoung/App";
    private static GlobalApplication sInstance;
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: ");
        sInstance = this;
    }

    public static GlobalApplication getInstance() {
        Log.d(TAG, "getInstance: "+sInstance);
        return sInstance;
    }
}
