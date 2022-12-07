package com.java.lesson.lesson16.task1;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Task1 {
    public static void main(String[] args) {
// String exampleDate = "26-03-1987T09:24";
        String exampleDate = "03-31-1987T09:24";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy'T'HH:mm");
        System.out.println(LocalDateTime.parse(exampleDate, formatter));


        LocalDate today = LocalDate.now();
        LocalDate past = LocalDate.of(2018, 7, 7);

        Period period = Period.between(past, today);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        long between = ChronoUnit.MONTHS.between(past, today);
        System.out.println(between);


    }
}
