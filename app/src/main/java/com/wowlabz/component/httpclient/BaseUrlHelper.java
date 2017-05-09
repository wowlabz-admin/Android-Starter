package com.wowlabz.component.httpclient;

import com.wowlabz.component.AppHelper;
import com.wowlabz.component.constants.Constants;

/**
 * Created by riteshdubey on 3/7/17.
 */

public final class BaseUrlHelper {

    public static String getBaseUrl() {
        if (AppHelper.getInstance().getBuildType() == AppHelper.BuildType.STAGING) {
            return Constants.BASE_URL_STAGING;
        } else {
            return Constants.BASE_URL_PROD;
        }
    }
}
