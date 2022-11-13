package com.java.lesson.lesson6;

public class Dog {
    private String name;
    public static String address;

    /**
     *  блок инициализации, для статических отдельно(статик пишем), для обычных отдельно
     */

    {
        name = "Hanna";
    }
    static {
        address = "Kommunarov, 12";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        Dog.address = address;
    }
}
