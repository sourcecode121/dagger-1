package com.example.dagger1;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Anand on 23/09/2016.
 */
public class Dagger1Application extends Application {

    @Inject
    ApplicationInfo appInfo;

    private static Dagger1Application instance;

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;
        Injector.init(this, Modules.list());
        Log.v(appInfo.className, "Dependency Injection");
    }

    public static Dagger1Application getInstance(){
        return instance;
    }
}
