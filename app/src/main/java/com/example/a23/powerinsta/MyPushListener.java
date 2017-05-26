package com.example.a23.powerinsta;

import android.content.Intent;

import org.json.JSONException;
import org.json.JSONObject;

import co.ronash.pushe.PusheListenerService;

public class MyPushListener extends PusheListenerService {
    public static JSONObject jo;
    @Override
    public void onMessageReceived(JSONObject jsonObject, JSONObject jsonObject1) {
        try {
            jo=new JSONObject(jsonObject.toString());
            Intent intent = new Intent(MyApplication.getContext(),Test.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
