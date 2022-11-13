package com.java.lesson.lesson7.task;


public class NewMenu {
    public static void start(){
        Animal animal = new Animal();
        animal.makeNoise();
        animal.eat();
        animal.sleep();

        Cat cat = new Cat();
        cat.makeNoise();
        cat.eat();
        cat.sleep();

        Dog dog = new Dog();
        dog.makeNoise();
        dog.eat();
        dog.sleep();

        Horse horse = new Horse();
        horse.makeNoise();
        horse.eat();
        horse.sleep();

//        Car car = new Car(engine);
//        car.move();
    }
}
