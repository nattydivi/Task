package com.java.task10;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Menu.start();

        File products2 = new File("test/ProductName.java");
        System.out.println(products2.getName());
        System.out.println(products2.getParent());

        File dir = new File("src/com/java/task10/product");
        String[] list = dir.list();
        Arrays.stream(list).forEach(System.out::println);

        RandomAccessFile raf = new RandomAccessFile("src/com/java/task10/test/ProductName.java", "rw");
// «курсор» стоит на 0-м символе.
        String text1 = raf.readLine();

        raf.seek(59);
        String text3 = raf.readLine();
        System.out.println(raf.length());

        raf.seek(59);
//        String en = "KARAMEL(1019),";
//печатаем в файл
//        raf.write(en.getBytes());

//закрываем файл
        raf.close();

        System.out.println(text1);
        System.out.println(text3);

    }
}
