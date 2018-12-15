package com.developer.willshuffy.meetap2;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

public class MeetApp extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        MeetApp.context = getApplicationContext();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    public static Context getContext(){
        return MeetApp.context;
    }


}
