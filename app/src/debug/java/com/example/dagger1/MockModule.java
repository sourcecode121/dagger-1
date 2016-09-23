package com.example.dagger1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Anand on 23/09/2016.
 */
@Module(
        complete = false,
        library = true,
        overrides = true
)
public class MockModule {

    // Same provider is used here. Changes to be made when overriding is required
    @Provides
    ApplicationInfo provideAppInfo(final Context context){

        Log.v("MockModule", "provideAppInfo");
        return context.getApplicationInfo();
    }
}
