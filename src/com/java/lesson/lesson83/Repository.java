package com.java.lesson.lesson83;

public interface Repository <T, M> {
    T create(M m);

    boolean delete(T t);

    T update();
}
