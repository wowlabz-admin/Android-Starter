package com.wowlabz.component.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/**
 * Created by riteshdubey on 2/17/17.
 */

public class AppUserSession {

    private static String PREFS_FILE_NAME = "crumbs_user_data_prefs";
    public static final String TOKEN_DETAIL = "token_data";
    public static final String CUSTOMER_DETAIL = "customer_data";
    public static final String FIRST_LAUNCH = "first_launch";
    public static final String ACCESS_TOKEN = "access_token";
    public static final String DEVICE_TOKEN = "device_token";

    public static final String LOGIN_STATUS = "isLoggedIn";

    Context mContext;

    private static AppUserSession mInstance = null;

    public AppUserSession(Context iContext) {
        this.mContext = iContext;
    }

    public static synchronized AppUserSession getInstance(Context iContext) {
        if (mInstance == null) {
            mInstance = new AppUserSession(iContext);

        } else {
        }
        return mInstance;
    }

    public void setLoginStatus(boolean isLoggedIn) {
        SharedPreferences aMyPrefs = mContext.getSharedPreferences(PREFS_FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = aMyPrefs.edit();
        prefsEditor.putBoolean(LOGIN_STATUS, isLoggedIn);
        prefsEditor.commit();
    }

    public boolean getLoginStatus() {
        SharedPreferences aMyPrefs = mContext.getSharedPreferences(PREFS_FILE_NAME, Context.MODE_PRIVATE);
        return aMyPrefs.getBoolean(LOGIN_STATUS, false);
    }

    public void setAccessToken(String iData) {
        if(!TextUtils.isEmpty(iData)) {
            saveString(ACCESS_TOKEN, iData);
        }
    }

    public String getAccessToken() {
        return getString(ACCESS_TOKEN);
    }

    ///--------------------------------------------------------------------------------------

    public void saveString(String iKey, String iValue) {
        SharedPreferences aMyPrefs = mContext.getSharedPreferences(PREFS_FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = aMyPrefs.edit();
        prefsEditor.putString(iKey, iValue);
        prefsEditor.commit();
    }

    public void saveBoolean(String iKey, boolean iValue) {
        SharedPreferences aMyPrefs = mContext.getSharedPreferences(PREFS_FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = aMyPrefs.edit();
        prefsEditor.putBoolean(iKey, iValue);
        prefsEditor.commit();
    }

    public void saveInteger(String iKey, int iValue) {
        SharedPreferences aMyPrefs = mContext.getSharedPreferences(PREFS_FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = aMyPrefs.edit();
        prefsEditor.putInt(iKey, iValue);
        prefsEditor.commit();
    }

    public String getString(String iKey) {
        SharedPreferences aMyPrefs = mContext.getSharedPreferences(PREFS_FILE_NAME, Context.MODE_PRIVATE);
        return aMyPrefs.getString(iKey, "");
    }

    public boolean getBoolean(String iKey) {
        SharedPreferences aMyPrefs = mContext.getSharedPreferences(PREFS_FILE_NAME, Context.MODE_PRIVATE);
        return aMyPrefs.getBoolean(iKey, false);
    }

    public int getInteger(String iKey) {
        SharedPreferences aMyPrefs = mContext.getSharedPreferences(PREFS_FILE_NAME, Context.MODE_PRIVATE);
        return aMyPrefs.getInt(iKey, 0);
    }

    ///--------------------------------------------------------------------------------------

    public void clearSavedData() {
        SharedPreferences aMyPrefs = mContext.getSharedPreferences(PREFS_FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = aMyPrefs.edit();
        prefsEditor.clear().commit();
    }
}
