package com.java.lesson.lesson7.animals;

public class Cat extends Animal {
    @Override
    public void say() {
        super.name = "Tom";
        System.out.println(super.name + "  mmmmaaaauu");
    }
}
