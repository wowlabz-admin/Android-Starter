package com.wowlabz.component.httpclient;


import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wowlabz.component.AppHelper;
import com.wowlabz.component.session.AppSession;
import com.wowlabz.component.constants.Constants;
import com.wowlabz.component.logger.Logger;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AppClient {
    private static API api;

    static {
        setupRestClient();
    }

    private AppClient() {
    }

    private static void setupRestClient() {
        Gson aGson = new GsonBuilder()
                .create();
        HttpLoggingInterceptor aLogging = new HttpLoggingInterceptor();
        // set your desired log level
        aLogging.setLevel(AppHelper.getInstance().isDebugEnabled() ? HttpLoggingInterceptor.Level.BODY : HttpLoggingInterceptor.Level.NONE);
        OkHttpClient aClient = new OkHttpClient.Builder().connectTimeout(30, TimeUnit.SECONDS).readTimeout(30, TimeUnit.SECONDS).retryOnConnectionFailure(false)
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request original = chain.request();
                        // Request customization: add request headers
                        Request.Builder requestBuilder = original.newBuilder().header(Constants.HEADER_CONNECTION_KEY, Constants.HEADER_CONNECTION_VALUE)
                                .method(original.method(), original.body());
                        String aAccessToken = AppSession.getInstance().getAccessToken();
                        if (!TextUtils.isEmpty(aAccessToken)) {
                            requestBuilder.addHeader(Constants.AUTHORIZATION_HEADER_NAME, aAccessToken);
                        }
                        Request request = requestBuilder.build();
                        Response response = chain.proceed(request);
                        boolean unAuthorized = (response.code() == 401);
                        Logger.logInfo("Url", request.url().toString());
                        return response;
                    }
                }).addInterceptor(aLogging).build();

        Retrofit aRetrofit = new Retrofit.Builder()
                .baseUrl(BaseUrlHelper.getBaseUrl())
                .client(aClient)
                .addConverterFactory(createGsonConverter())
                .build();

        api = aRetrofit.create(API.class);
    }

    private static Converter.Factory createGsonConverter() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        return GsonConverterFactory.create(gson);
    }

    public static API get() {
        return api;
    }
}