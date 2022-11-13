package com.java.lesson.lesson7;

public class NewMenu {
    public static void start(){
        Engine engine = new Engine();
        Car car = new Car(engine);
        car.move();
    }
}
