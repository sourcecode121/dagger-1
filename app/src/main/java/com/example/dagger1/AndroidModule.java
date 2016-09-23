package com.example.dagger1;

import android.content.Context;
import android.content.pm.ApplicationInfo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Anand on 23/09/2016.
 */
@Module(library = true)
public class AndroidModule {

    @Provides
    @Singleton
    Context provideAppContext(){
        return Dagger1Application.getInstance().getApplicationContext();
    }

    @Provides
    ApplicationInfo provideAppInfo(final Context context){
        return context.getApplicationInfo();
    }
}
