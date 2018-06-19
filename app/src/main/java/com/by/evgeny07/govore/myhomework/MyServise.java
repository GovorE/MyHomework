package com.by.evgeny07.govore.myhomework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyServise extends Service{
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("Create","create");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("Creae","Start");
        return super.onStartCommand(intent, flags, startId);


    }


    @Override
    public boolean onUnbind(Intent intent) {
        Log.e("Creae","Unbing");
        return super.onUnbind(intent);

    }
}


