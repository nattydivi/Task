package com.java.lesson.lesson101;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class PathRunner {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "writer.txt");//
        Files.write(path, List.of("H", "klnjd"));
        Files.lines(path).forEach(System.out::println);
    }
}
