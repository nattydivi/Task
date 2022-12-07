package com.java.lesson.lesson16;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
// Date date = new Date();
// ZonedDateTime dateTime = ZonedDateTime.now();
//// ZonedDateTime dateTime = ZonedDateTime.of();
// System.out.println(dateTime);
//
// long milli = dateTime.toInstant().toEpochMilli();
// System.out.println(milli);
//
// dateTime.minusDays(2);
// ZonedDateTime plusDays = dateTime.plusDays(1L);
// ZonedDateTime plusDays2= dateTime.plus(3, ChronoUnit.DAYS);
// System.out.println(plusDays2);
// ZonedDateTime plusDays3 = dateTime.truncatedTo(ChronoUnit.DAYS);
// System.out.println(plusDays3);

        ZonedDateTime dateTime = ZonedDateTime.now();
        ZonedDateTime plusDays2 = dateTime.plus(3, ChronoUnit.DAYS);
        boolean after = dateTime.isAfter(plusDays2);
        System.out.println(after);

        LocalDate now = LocalDate.now();
        LocalDateTime now1 = LocalDateTime.now(ZoneOffset.UTC);
        System.out.println(now);
        System.out.println(now1);


    }
}