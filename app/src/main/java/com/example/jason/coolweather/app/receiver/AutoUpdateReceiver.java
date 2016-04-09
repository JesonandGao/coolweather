package com.example.jason.coolweather.app.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.jason.coolweather.app.service.AutoUpdateService;

/**
 * Created by Jason on 4/9/2016.
 * 定时任务8小时 广播接收者
 */
public class AutoUpdateReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startService(i);
    }
}
