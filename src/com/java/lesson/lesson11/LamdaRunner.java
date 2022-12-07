package com.java.lesson.lesson11;

import java.util.List;

public class LamdaRunner {
    public static void main(String[] args) {
        List<String> strings = List.of("11", "22", "33", "44", "55", "66", "22", "33", "44");
        strings.stream()
                .map(value -> value + value)
                .map(Integer::valueOf)
                .filter(item -> item % 2 == 0)
                .distinct()
                .forEach(System.out::println);

        for (String string : strings) {
            String value = string + string;
            Integer integer = Integer.valueOf(value);
            if (integer % 2 == 0) {
                System.out.println(integer);
            }

        }
    }
}
