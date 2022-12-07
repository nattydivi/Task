package com.java.lesson.lesson16.task1;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2022, 5, 31, 19, 47);
        LocalDateTime newDate = localDateTime.plus(3L, ChronoUnit.MONTHS);
        System.out.println(newDate.toLocalDate());
        System.out.println(newDate.toLocalTime());

        LocalDateTime localDateTime1 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        System.out.println(localDateTime1.format(formatter));
        System.out.println(newDate.format(formatter));

    }
}