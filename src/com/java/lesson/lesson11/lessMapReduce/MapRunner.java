package com.java.lesson.lesson11.lessMapReduce;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student("Nikita", 12),
                new Student("In", 14),
                new Student("Max", 21),
                new Student("Tim", 12),
                new Student("Nick", 33),
                new Student("Mike", 14));

        Optional<Integer> integer = students.stream()
                .parallel()
                .map(Student::getAge)
                .reduce(Math::max);


        integer.ifPresent(System.out::println);

        List<Integer> integers = List.of(1, 24, 24, 541, 654, 41, 4154);
        IntSummaryStatistics intSummaryStatistics = integers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);

        IntStream.range(0, 10).forEach(System.out::println);
        IntStream.range(0, 10).forEach(System.out::println);
        IntStream.iterate(0, operand -> operand + 3)
                .skip(10)
                .limit(20)
                .forEach(System.out::println);

    }
}
