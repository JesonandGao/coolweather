package com.example.jason.coolweather.app.util;

/**
 * Created by Jason on 4/9/2016.
 * 该接口， 用于回调服务返回的结果
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
