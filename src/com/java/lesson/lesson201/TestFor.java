package com.java.lesson.lesson201;

public class TestFor implements Runnable {
    int x=0, y=0;
    public int incr(){
        x++;
        return x;
    }
    public int incr1(){
        y++;
        return y;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+": "+incr()+" "+incr1());
        }
    }

    public static void main(String[] args) {
        TestFor a=new TestFor();
        TestFor b=new TestFor();
        Thread q=new Thread(a);
        Thread w=new Thread(b);
        q.start();
        w.start();
    }
}
