package com.java.lesson.lesson201;

public class Test {
    public static void main(String[] args) {
        System.out.println("1 ");
        synchronized (args) {
            System.out.println("2 ");
            try {
                args.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("3 ");
    }
}
