package com.java.lesson.lesson83;

public class PersonRepository implements Repository <Person, String>{


    @Override
    public Person create(String s) {
        return null;
    }

    @Override
    public boolean delete(Person person) {
        return false;
    }

    @Override
    public Person update() {
        return null;
    }
}
