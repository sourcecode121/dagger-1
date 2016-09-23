package com.example.dagger1;

import android.app.Application;

/**
 * Created by Anand on 23/09/2016.
 */
public class Dagger1Application extends Application {

    private static Dagger1Application instance;

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;

        //Injector.init(this, Modules.list());
    }

    public static Dagger1Application getInstance(){
        return instance;
    }
}
