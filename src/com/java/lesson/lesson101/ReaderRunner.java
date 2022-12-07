package com.java.lesson.lesson101;

import java.io.*;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class ReaderRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "text.txt").toFile();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String collect = reader
                    .lines()
                    .collect(Collectors.joining("\n"));
            System.out.println(collect);
        }
    }
}
