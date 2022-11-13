package com.java.lesson.lesson8;

public class Car {
    public void print(){
        String str = "Hello";
        extracted(str);
    }

    private void extracted(String name) {
        if(true){
            String str = "Hello";
            System.out.println(name);
            class Motor{

            }
        }
    }

//    private Motor motor = new Car.Motor();
//
//    public Motor getMotor(){
//        return motor;
//    }
//
//    class Motor {
//        public void print(){
//            System.out.println("Hello from inner class");
//            getMotor();
//        }
//    }
}
