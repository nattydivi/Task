package com.java.lesson.lesson201;

public class Test_A extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("A");
            System.out.println("B");
        }
    }
}
class TestDemo extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("C");
            System.out.println("D");
        }
    }

    public static void main(String args []) {
        Test_A t1 =new Test_A();
        TestDemo t2 =new TestDemo();
        t1.start();
        t2.start();
    }
}