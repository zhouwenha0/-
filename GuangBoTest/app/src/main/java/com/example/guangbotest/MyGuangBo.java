package com.example.guangbotest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyGuangBo extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"我的广播发了",Toast.LENGTH_SHORT).show();
        abortBroadcast();
    }
}
