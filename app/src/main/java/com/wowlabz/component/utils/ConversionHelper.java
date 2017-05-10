package com.wowlabz.component.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class ConversionHelper {
    /**
     * This method converts dp unit to equivalent pixels, depending on device density.
     *
     * @param dp A value in dp (density independent pixels) unit. Which we need to convert into pixels
     * @return A float value to represent px equivalent to dp depending on device density
     */
    public static float dpToPx(Context iContext, float dp) {
        Resources resources = iContext.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        return dp * (metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }

    public static float pxToDp(Context iContext, float px) {
        Resources resources = iContext.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        return px / (metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }

    public static int getScreenWidth() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static int getScreenHeight() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }
}