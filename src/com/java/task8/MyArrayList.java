package com.java.task8;

public class MyArrayList <T> implements MyList <T> {
    protected int capacity;
    protected Object[] myArray;

    public MyArrayList(){
        this.myArray = new Object[10];
    }

    public MyArrayList(int capacity){
        this.myArray = new Object[capacity];
        this.capacity = capacity;
    }

    @Override
    public T add(T value) {
        for (int i=0; i< myArray.length; i++ ){
            myArray[i] = value;
        }
        return null;
    }

    @Override
    public T size() {
        return null;
    }

    @Override
    public T isEmpty() {
        return null;
    }
}
