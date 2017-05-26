package com.example.a23.powerinsta;

import android.app.Application;
import android.content.Context;

/**
 * Created by 23 on 20/05/2017.
 */

public class MyApplication extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getContext() {
        return mContext;
    }

}
