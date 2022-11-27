package com.java.task10.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {
    java.util.Date myDate = parseDate("20-09-22");
    public static java.util.Date parseDate(String date){
        try {
            return new SimpleDateFormat("dd-MM-yy").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }
}
