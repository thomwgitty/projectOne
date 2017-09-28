package com.example.tom.beautifulbulldog;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by Tom on 27/09/2017.
 */

public class BulldogApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();

        Realm.init(this);
    }
}
