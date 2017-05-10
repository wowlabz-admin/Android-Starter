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
            SimpleDateFormat postFormatter = new SimpleDateFormat(iOutputFormat, Locale.getDefault());
            String newDateStr = postFormatter.format(date);
            Log.d("Date", "newDateStr ITC =" + newDateStr);
            if (DateUtils.isToday(date.getTime())) {
                SimpleDateFormat postTodayFormatter = new SimpleDateFormat("h:mm a", Locale.getDefault());
                String aTodaysDate = postTodayFormatter.format(date);
                return (aTodaysDate + ", Today");
            } else {
                return newDateStr;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "Error";
    }

    public static String dateFormatter(Date iDate, String iOutputFormat) {
        SimpleDateFormat postFormatter = new SimpleDateFormat(iOutputFormat, Locale.getDefault());
        String newDateStr = postFormatter.format(iDate);
        Log.d("Date", "newDateStr ITC =" + newDateStr);
        if (DateUtils.isToday(iDate.getTime())) {
            SimpleDateFormat postTodayFormatter = new SimpleDateFormat("h:mm a", Locale.getDefault());
            String aTodaysDate = postTodayFormatter.format(iDate);
            return (aTodaysDate + ", Today");
        } else {
            return newDateStr;
        }
    }

    public static String dateFormatter(long iDateInMillis, String iOutputFormat) {
        Date date = new Date(iDateInMillis);
        SimpleDateFormat postFormatter = new SimpleDateFormat(iOutputFormat, Locale.getDefault());
        String newDateStr = postFormatter.format(date);
        Log.d("Date", "newDateStr ITC =" + newDateStr);
        if (DateUtils.isToday(date.getTime())) {
            SimpleDateFormat postTodayFormatter = new SimpleDateFormat("h:mm a", Locale.getDefault());
            String aTodaysDate = postTodayFormatter.format(date);
            return (aTodaysDate + ", Today");
        } else {
            return newDateStr;
        }
    }

    public static String dateFormatter(String iDate) {
        SimpleDateFormat aFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        try {
            Date date = aFormat.parse(iDate);
            SimpleDateFormat postFormatter = new SimpleDateFormat("h:mm a,dd MMM yyyy", Locale.getDefault());
            postFormatter.setTimeZone(TimeZone.getTimeZone("GMT+11:00"));
            String newDateStr = postFormatter.format(date);
            Log.d("Date", "newDateStr ITC =" + newDateStr);
            if (DateUtils.isToday(date.getTime())) {
                SimpleDateFormat postTodayFormatter = new SimpleDateFormat("h:mm a", Locale.getDefault());
                postTodayFormatter.setTimeZone(TimeZone.getTimeZone("GMT+11:00"));
                String aTodaysDate = postTodayFormatter.format(date);
                return (aTodaysDate + ", Today");
            } else {
                return newDateStr;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "Error";
    }

    public static String dateFormatter(Date iDate) {
        SimpleDateFormat postFormatter = new SimpleDateFormat("h:mm a,dd MMM yyyy", Locale.getDefault());
        postFormatter.setTimeZone(TimeZone.getTimeZone("GMT+11:00"));
        String newDateStr = postFormatter.format(iDate);
        Log.d("Date", "newDateStr ITC =" + newDateStr);
        if (DateUtils.isToday(iDate.getTime())) {
            SimpleDateFormat postTodayFormatter = new SimpleDateFormat("h:mm a", Locale.getDefault());
            postTodayFormatter.setTimeZone(TimeZone.getTimeZone("GMT+11:00"));
            String aTodaysDate = postTodayFormatter.format(iDate);
            return (aTodaysDate + ", Today");
        } else {
            return newDateStr;
        }
    }

    public static String dateFormatter(long iDateInMillis) {
        Date date = new Date(iDateInMillis);
        SimpleDateFormat postFormatter = new SimpleDateFormat("h:mm a,dd MMM yyyy", Locale.getDefault());
        postFormatter.setTimeZone(TimeZone.getTimeZone("GMT+11:00"));
        String newDateStr = postFormatter.format(date);
        Log.d("Date", "newDateStr ITC =" + newDateStr);
        if (DateUtils.isToday(date.getTime())) {
            SimpleDateFormat postTodayFormatter = new SimpleDateFormat("h:mm a", Locale.getDefault());
            postTodayFormatter.setTimeZone(TimeZone.getTimeZone("GMT+11:00"));
            String aTodaysDate = postTodayFormatter.format(date);
            return (aTodaysDate + ", Today");
        } else {
            return newDateStr;
        }
    }

    public static String convertTimeStampToSimpleIST(String iDate, String iInputFormat, String iOutputFormat) {
        return convertTimeStampToSimple(iDate, iInputFormat, iOutputFormat, "IST");
    }

    public static String convertTimeStampToSimpleIST(Date iDate, String iOutputFormat) {
        return convertTimeStampToSimple(iDate, iOutputFormat, "IST");
    }

    public static String convertTimeStampToSimpleIST(long iDateInMillis, String iOutputFormat) {
        return convertTimeStampToSimple(iDateInMillis, iOutputFormat, "IST");
    }

    public static String convertTimeStampToSimple(String iDate, String iInputFormat, String iOutputFormat, String iTimeZoneCode) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(iInputFormat, Locale.getDefault());
            dateFormat.setTimeZone(TimeZone.getTimeZone(iTimeZoneCode));
            Date myDate = null;
            try {
                myDate = dateFormat.parse(iDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            SimpleDateFormat timeFormat = new SimpleDateFormat(iOutputFormat, Locale.getDefault());
            timeFormat.setTimeZone(TimeZone.getTimeZone(iTimeZoneCode));
            return timeFormat.format(myDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Error";
    }

    public static String convertTimeStampToSimple(Date iDate, String iOutputFormat, String iTimeZoneCode) {
        try {
            SimpleDateFormat timeFormat = new SimpleDateFormat(iOutputFormat, Locale.getDefault());
            timeFormat.setTimeZone(TimeZone.getTimeZone(iTimeZoneCode));
            return timeFormat.format(iDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Error";
    }

    public static String convertTimeStampToSimple(long iDateInMillis, String iOutputFormat, String iTimeZoneCode) {
        try {
            Date myDate = new Date(iDateInMillis);
            SimpleDateFormat timeFormat = new SimpleDateFormat(iOutputFormat, Locale.getDefault());
            timeFormat.setTimeZone(TimeZone.getTimeZone(iTimeZoneCode));
            return timeFormat.format(myDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Error";
    }
}
