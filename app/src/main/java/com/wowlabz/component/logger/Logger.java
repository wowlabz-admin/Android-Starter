package com.wowlabz.component.logger;

import android.util.Log;

import com.wowlabz.component.AppHelper;
import com.wowlabz.component.constants.Constants;

/**
 * Created by riteshdubey on 12/30/16.
 */

public class Logger {

    public static void logVerbose(String iTitle, String iLogMessage) {
        if (AppHelper.getInstance().isDebugEnabled())
            Log.v(Constants.TAG, iTitle + " : " + iLogMessage);
    }

    public static void logInfo(String iTitle, String iLogMessage) {
        if (AppHelper.getInstance().isDebugEnabled()) {
            Log.i(Constants.TAG, iTitle + " : " + iLogMessage);
        }
    }

    public static void logError(String iTitle, String iLogMessage, Exception iException) {
        if (AppHelper.getInstance().isDebugEnabled())
            Log.e(Constants.TAG, iTitle + " : " + iLogMessage, iException);

    }

    public static void logWarn(String iTitle, String iLogMessage) {
        if (AppHelper.getInstance().isDebugEnabled())
            Log.w(Constants.TAG, iTitle + " : " + iLogMessage);

    }

    public static void logWarn(String iLogMessage) {
        if (AppHelper.getInstance().isDebugEnabled())
            Log.w(Constants.TAG, iLogMessage);

    }

    public static void logDebug(String iTitle, String iLogMessage) {
        if (AppHelper.getInstance().isDebugEnabled())
            Log.d(Constants.TAG, iTitle + " : " + iLogMessage);

    }
}
