package com.example.guangbotest2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class GuangBoJeiShou2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"广播接收器2号收到了",Toast.LENGTH_SHORT).show();
    }
}
