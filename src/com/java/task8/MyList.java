package com.java.task8;

public interface MyList<T> {
    void add(T value);

    int size();

    boolean isEmpty();

    T get(int index);

    T set(int index, T value);

    void add(int index, T value);

    T remove(int index);

    int indexOf(Object value);

    boolean remove(Object value);

    boolean contains(Object value);

    boolean addAll(MyList<? extends T> value);

    Object[] toArray();
}
