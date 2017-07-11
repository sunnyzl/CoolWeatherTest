package com.example.zhaoliang.coolweathertest.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by zhaoliang on 10/07/2017.
 */

public class HttpUtile {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
