package com.wowlabz.component.session;

import com.wowlabz.component.AppHelper;
import com.wowlabz.component.storage.AppUserSession;

/**
 * Created by riteshdubey on 1/4/17.
 */

public class AppSession {
    private static AppSession mInstance;

    public static AppSession getInstance() {
        if (mInstance == null) {
            mInstance = new AppSession();
        }
        return mInstance;
    }

    /**
     * Gets the access token for the current session
     *
     * @return access token
     */
    public String getAccessToken() {
        return AppUserSession.getInstance(AppHelper.getInstance().getContext()).getAccessToken();
    }


    public void setAccessToken(String iAccessToken) {
        AppUserSession.getInstance(AppHelper.getInstance().getContext()).setAccessToken(iAccessToken);
    }

    /**
     * Clears the current session
     */
    public void clearSession() {
        AppUserSession.getInstance(AppHelper.getInstance().getContext()).setAccessToken("");
    }
}
