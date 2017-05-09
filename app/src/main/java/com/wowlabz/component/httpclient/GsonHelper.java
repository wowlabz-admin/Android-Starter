package com.wowlabz.component.httpclient;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class GsonHelper {
    public static Gson mGson = new GsonBuilder().create();

    public static Object getGson(String json, Class<?> class1) {

        return mGson.fromJson(json, class1);
    }

    public static <T> String toJson(T iData){
        return mGson.toJson(iData);
    }
}
