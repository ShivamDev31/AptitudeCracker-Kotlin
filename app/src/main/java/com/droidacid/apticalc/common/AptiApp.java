package com.droidacid.apticalc.common;

import android.app.Application;

/**
 * Created by shivam on 3/9/17.
 */

public class AptiApp extends Application {


    private static AptiApp instance;

    public static AptiApp getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}