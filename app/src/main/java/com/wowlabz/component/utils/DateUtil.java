package com.wowlabz.component.utils;

import android.text.format.DateUtils;
import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by riteshdubey on 5/10/17.
 */

public class DateUtil {

    public static String dateFormatter(String iDate, String iInputFormat, String iOutputFormat) {
        SimpleDateFormat aFormat = new SimpleDateFormat(iInputFormat, Locale.getDefault());
        try {
            Date date = aFormat.parse(iDate);
            SimpleDateFormat postFormater = new SimpleDateFormat(iOutputFormat, Locale.getDefault());
            String newDateStr = postFormater.format(date);
            Log.d("Date", "newDateStr ITC =" + newDateStr);
            if (DateUtils.isToday(date.getTime())) {
                SimpleDateFormat postTodayFormater = new SimpleDateFormat("h:mm a", Locale.getDefault());
                String aTodaysDate = postTodayFormater.format(date);
                return (aTodaysDate + ", Today");
            } else {
                return newDateStr;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "Error";
    }

    public static String dateFormatter(String iDate) {
        SimpleDateFormat aFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        try {
            Date date = aFormat.parse(iDate);
            SimpleDateFormat postFormater = new SimpleDateFormat("h:mm a,dd MMM yyyy", Locale.getDefault());
            postFormater.setTimeZone(TimeZone.getTimeZone("GMT+11:00"));
            String newDateStr = postFormater.format(date);
            Log.d("Date", "newDateStr ITC =" + newDateStr);
            if (DateUtils.isToday(date.getTime())) {
                SimpleDateFormat postTodayFormater = new SimpleDateFormat("h:mm a", Locale.getDefault());
                postTodayFormater.setTimeZone(TimeZone.getTimeZone("GMT+11:00"));
                String aTodaysDate = postTodayFormater.format(date);
                return (aTodaysDate + ", Today");
            } else {
                return newDateStr;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "Error";
    }

    public static String convertTimeStampToSimpleIST(String iDate, String iInputFormat, String iOutputFormat) {
        String finalDate = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(iInputFormat, Locale.getDefault());
            dateFormat.setTimeZone(TimeZone.getTimeZone("IST"));
            Date myDate = null;
            try {
                myDate = dateFormat.parse(iDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            SimpleDateFormat timeFormat = new SimpleDateFormat(iOutputFormat, Locale.getDefault());
            timeFormat.setTimeZone(TimeZone.getDefault());
            finalDate = timeFormat.format(myDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return finalDate;
    }
}
