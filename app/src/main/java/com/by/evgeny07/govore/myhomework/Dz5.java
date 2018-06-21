package com.by.evgeny07.govore.myhomework;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

public class Dz5 extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dz5);

    }


    @Override
    protected void onResume() {
        super.onResume();
        //   IntentFilter intentFilter = new IntentFilter();
        //   intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        //   registerReceiver(broadcastReceiver,intentFilter);

        IntentFilter intentFilter1 = new IntentFilter();
        intentFilter1.addAction(BluetoothAdapter.ACTION_CONNECTION_STATE_CHANGED);
        registerReceiver(broadcastReceiver,intentFilter1);

        // startService(new Intent(this,MyServise.class));
        bindService(new Intent(this,MyServise.class), serviceConnection,BIND_ABOVE_CLIENT);

        //local
        //LocalBroadcastManager.getInstance(this).unregisterReceiver(broadcastReceiver);

    }
    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.e("AAA","ServerConn");
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    };


    @Override
    protected void onPause() {
        super.onPause();
        unbindService(serviceConnection);
        //  stopService(new Intent(this,MyServise.class));
        //global
        // unregisterReceiver(broadcastReceiver);


        //local

        // LocalBroadcastManager.getInstance(this).registerReceiver(broadcastReceiver, intentFilter);

    }



    private BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {


            Log.e("AAA","Changed");
        }
    };
}
