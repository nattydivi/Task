package com.java.lesson.lesson101;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class WriterRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "writer.txt").toFile();
        try (var bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            bufferedWriter.append("Hello world!!!");
            bufferedWriter.newLine();
            bufferedWriter.append("Java!");

        }
    }
}
