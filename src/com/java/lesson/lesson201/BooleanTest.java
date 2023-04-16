package com.java.lesson.lesson201;

public class BooleanTest {
    private static Boolean test;
//    смотря с какой буквы написано, тут исключение выбрасывает, налл, а если  примитив, то тогда ответ фолс

    public static void main(String[] args) {

        if (test) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}