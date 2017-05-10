package com.wowlabz.component;

import android.app.Application;
import android.content.Context;

import static com.wowlabz.component.AppHelper.BuildType.PRODUCTION;

public class AppHelper {

    private static AppHelper mInstance;
    private Context mContext;
    private static boolean DEBUG = false;
    private static final BuildType DEFAULT_BUILD_TYPE = PRODUCTION;
    private BuildType mBuildType = DEFAULT_BUILD_TYPE;

    public static AppHelper getInstance() {
        if (mInstance == null) {
            mInstance = new AppHelper();
        }
        return mInstance;
    }

    /**
     * Initialises the SDK with application context. This method should be initialized in the Application class of the app
     *
     * @param iContext Application Context
     */
    public void initialize(Context iContext) {
        mContext = iContext;
        validateContext();
    }

    /**
     * Gets the Application context of the app used to initialize the framework
     *
     * @return Application Context
     */
    public Context getContext() {
        if (mContext != null)
            return mContext;
        else
            throw new RuntimeException("Context cannot be null. Please initialize the framework using initialize(Context iContext)");
    }

    private void validateContext() {
        if (mContext instanceof Application) {
        } else {
            throw new RuntimeException("Use Application context to initialize the app");
        }
    }

    /**
     * Enable debug mode
     *
     * @param iDebug Boolean to toggle debug mode on and off
     */
    public void enableDebug(boolean iDebug) {
        DEBUG = iDebug;
    }

    /**
     * Check whether debug mode is enabled
     *
     * @return Boolean
     */
    public boolean isDebugEnabled() {
        return DEBUG;
    }

    public enum BuildType {
        STAGING, PRODUCTION
    }

    /**
     * Change build type of APIs.
     * See also {@link BuildType#PRODUCTION}, {@link BuildType#STAGING}
     *
     * @param iType
     */
    public void setBuildType(BuildType iType) {
        mBuildType = iType;
    }

    /** Gets the current build type
     *
     * @return BuildType
     */
    public BuildType getBuildType() {
        return mBuildType;
    }
}
