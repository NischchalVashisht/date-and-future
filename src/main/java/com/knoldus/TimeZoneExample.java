package com.knoldus;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * following class show  give current time according to time zone
 */
public class TimeZoneExample {

    /**
     *
     * @param timeZone represent time zone whose time user wants
     * @return return time
     */
    static String getTimeFromTimeZone(String timeZone){
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

// Use Madrid's time zone to format the date in
        df.setTimeZone(TimeZone.getTimeZone("Europe/Madrid"));
        return df.format(date).toString();
    }

}
