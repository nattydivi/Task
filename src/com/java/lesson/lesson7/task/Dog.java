package com.java.lesson.lesson7.task;

public class Dog extends Animal {
    public String type;

    {
        type = "гончая";
    }

    @Override
    public void makeNoise() {
        super.name = "Tomm";
        System.out.print(super.name + ":  гав!! ");
    }

    @Override
    public void eat() {
        System.out.print(" Он ест мясо");
    }

    @Override
    public void sleep() {
        System.out.println(" и спит в будке");
    }
}

