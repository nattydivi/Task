package com.java.lesson.lesson7;

public class Car {
    private String model;
    private int maxSpeed;
    private Engine engine;
    private Passenger [] passengers = new Passenger[4];

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void move(){
        engine.start();
        System.out.println("Start...");
    }

    public Car() {

    }
}
