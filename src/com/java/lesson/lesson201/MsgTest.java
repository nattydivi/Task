package com.java.lesson.lesson201;

public class MsgTest {

    public static void main(String[] args) {
        String msg = "Hello";
        change(msg);
        System.out.println(msg);
        msg = change(msg);
        System.out.println(msg);

    }

    public static String change(String msg) {
        msg = msg + " world";
        return " java!";
    }
}