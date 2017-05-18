package com.wowlabz.component.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class ConversionHelper {
    /**
     * This method converts dp unit to equivalent pixels, depending on device density.
     *
     * @param iContext Context to get resources and device specific display metrics
     * @param dp       A value in dp (density independent pixels) unit. Which we need to convert into pixels
     * @return A float value to represent px equivalent to dp depending on device density
     */
    public static float dpToPx(Context iContext, float dp) {
        Resources resources = iContext.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        return dp * (metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }

    /**
     * This method converts device specific pixels to density independent pixels.
     *
     * @param iContext Context to get resources and device specific display metrics
     * @param px       A value in px (pixels) unit. Which we need to convert into db
     * @return A float value to represent dp equivalent to px value
     */
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