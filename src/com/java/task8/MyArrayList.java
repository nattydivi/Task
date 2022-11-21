package com.java.task8;

import java.util.Arrays;
import java.util.Objects;

import static com.java.task8.Constants.DEFAULT_CAPACITY;
import static com.java.task8.Constants.ILLEGAL_INDEX;

public class MyArrayList<T> implements MyList<T> {
    private int size;
    private int sizeNew;
    private Object[] myArray;

    public MyArrayList() {
        this.myArray = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            this.myArray = new Object[capacity];
        } else System.out.println(ILLEGAL_INDEX);
    }

    public MyArrayList(MyList<? extends T> col) {
        Object[] a = col.toArray();
        this.size = col.size();
        myArray = a;
    }

    private Object[] increaseCapacity() {
        Object[] myArrayBig = new Object[myArray.length + (myArray.length >> 1)];
        System.arraycopy(myArray, 0, myArrayBig, 0, myArray.length);
        return myArrayBig;
    }

    @Override
    public void add(T value) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == null) {
                myArray[i] = value;
                size++;
                break;
            } else if (i == myArray.length - 1) {
                myArray = increaseCapacity();
                myArray[size] = value;
                size++;
                break;
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void checksIndex(int index) {
        if (index < 0 || index >= this.size) {
            System.out.println(ILLEGAL_INDEX);
        }
    }

    @Override
    public T get(int index) {
        checksIndex(index);
        return (T) myArray[index];
    }

    @Override
    public T set(int index, T value) {
        T valuePast;
        if (index >= 0 && index < this.size) {
            valuePast = (T) myArray[index];
            myArray[index] = value;
            return valuePast;
        }
        return null;
    }

    private Object[] copyArrayForInsert(int index) {
        Object[] myArrayNew = new Object[myArray.length + 1];
        System.arraycopy(myArray, 0, myArrayNew, 0, index);
        System.arraycopy(myArray, index, myArrayNew, index + 1, myArray.length - index);
        return myArrayNew;
    }

    @Override
    public void add(int index, T value) {
        if (index >= 0 && index < this.size) {
            myArray = copyArrayForInsert(index);
            myArray[index] = value;
            size++;
        } else System.out.println(ILLEGAL_INDEX);
    }

    private Object[] copyArrayForRemove(int index) {
        Object[] myArrayNew = new Object[myArray.length - 1];
        System.arraycopy(myArray, 0, myArrayNew, 0, index);
        System.arraycopy(myArray, index + 1, myArrayNew, index, myArray.length - (index + 1));
        return myArrayNew;
    }

    @Override
    public T remove(int index) {
        T value;
        if (index >= 0 && index < this.size) {
            value = (T) myArray[index];
            myArray = copyArrayForRemove(index);
            size--;
            return value;
        } else System.out.println(ILLEGAL_INDEX);
        return null;
    }

    @Override
    public boolean contains(Object value) {
        for (Object o : myArray) {
            if (Objects.equals(o, value))
                return true;
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] myArrayNew = new Object[size + 10];
        System.arraycopy(myArray, 0, myArrayNew, 0, size);
        this.sizeNew = this.size;
        return myArrayNew;
    }

    public boolean addAll(MyList<? extends T> value) {
        Object[] col = value.toArray();
        Object[] united = new Object[col.length + myArray.length];
        System.arraycopy(myArray, 0, united, 0, size);
        System.arraycopy(col, 0, united, size, value.size());
        myArray = united;
        size = size + value.size();
        return true;
    }

    @Override
    public int indexOf(Object value) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == value) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean remove(Object value) {
        int index = indexOf(value);
        remove(index);
        return true;
    }

    @Override
    public String toString() {
        return "MyArrayList {" +
                " size=" + size +
                ", myArray=" + Arrays.toString(myArray) +
                '}';
    }
}
