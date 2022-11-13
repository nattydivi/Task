package com.java.lesson.lesson7.task;

public class Horse extends Animal {
    public String hooves;

    {
        hooves = "парные";
    }


    @Override
    public void makeNoise() {
        super.name = "Orange";
        System.out.println(super.name + "  иии-го-го");
    }

    @Override
    public void eat() {
        System.out.println(super.name + " ест траву");
    }

    @Override
    public void sleep() {
        System.out.println(super.name + "  спит на сене");
    }
}

