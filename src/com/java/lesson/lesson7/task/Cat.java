package com.java.lesson.lesson7.task;

public class Cat extends Animal {
    public String wool;

    {
        wool = "короткая";
    }


    @Override
    public void makeNoise() {
        super.name = "Miki";
        System.out.println(super.name + "  мяяяяу");
    }

    @Override
    public void eat() {
        System.out.println(super.name + " ест рыбу");
    }

    @Override
    public void sleep() {
        System.out.println(super.name + "  спит на подушке");
    }
}
