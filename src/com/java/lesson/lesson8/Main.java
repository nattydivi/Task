package com.java.lesson.lesson8;
interface Animal{
    void eat();
}

//class Dog extends Animal{
//    @Override
//    public void eat() {
//        System.out.println("Dog is eating");
//    }
//}

public class Main {
    public static void main(String[] args) {

        Animal dog = () -> System.out.println("Dog is eating33");
        dog.eat();


//
//        Animal dog = new Animal(){
//            @Override
//            public void eat() {
//                System.out.println("Dog is eating222");
//            }
//        };
////        Animal dog = new Dog();
//        dog.eat();


//        Car car = new Car();
//        Car.Motor motor = car.getMotor();
//        motor.print();
    }
}
