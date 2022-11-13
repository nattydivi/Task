package com.java.lesson.lesson7.animals;

    public class Dog extends Animal {

        @Override
        public void say() {
            super.name = "Bon";
            System.out.println(super.name + "  rrrrr");
        }
}
