package com.java.task81;

public class MyArrayList <T> implements MyList<T> {
    protected int capacity;
    protected T[] myArray;


    public MyArrayList(){
        myArray = (T[]) new Object[10];
    }

    public MyArrayList(int capacity){
        this.myArray = (T[]) new Object[capacity];
        this.capacity = capacity;
    }

}
