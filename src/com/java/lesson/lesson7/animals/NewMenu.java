package com.java.lesson.lesson7.animals;

public class NewMenu {
    public static void start(){
        Animal animal = new Dog();
//        cat.say();
//        tell(dog);
        tell(animal);

    }

    private static void tell(Animal animal) {
        animal.say();
    }

//    private static void tell(Dog dog) {
//        dog.say();
//    }

}
