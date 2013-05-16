package com.rejasupotaro.katanuki;

import android.app.Application;

import com.activeandroid.ActiveAndroid;

public class KatanukiApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }

    @Override public void onTerminate() {
        ActiveAndroid.dispose();
    }

}
