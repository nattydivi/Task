package com.java.lesson.lesson7.task;


public class Main {
    public static void main(String[] args) {
        Animal [] animal = new Animal[3];

        animal[0] = new Cat();
        animal[1] = new Dog();
        animal[2] = new Horse();

//

        NewMenu.start();

    }

}
