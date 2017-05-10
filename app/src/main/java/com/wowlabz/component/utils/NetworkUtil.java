package com.wowlabz.component.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.wowlabz.component.AppHelper;
import com.wowlabz.component.logger.Logger;

public class NetworkUtil {

    private static final String NETWORK_WIFI = "WIFI";
    private static final String NETWORK_MOBILE = "MOBILE";
    private static boolean mConnected = false;


    public static boolean isOnline() {
        try {
            ConnectivityManager aConnectivityManager = (ConnectivityManager) AppHelper.getInstance().getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo aNetworkInfo = aConnectivityManager.getActiveNetworkInfo();
            mConnected = aNetworkInfo != null && aNetworkInfo.isAvailable() && aNetworkInfo.isConnected();
            return mConnected;
        } catch (Exception e) {
            Logger.logDebug("CheckConnectivity Exception: ", e.getMessage());
        }
        return mConnected;
    }
}