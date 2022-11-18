package com.java.task8;

public class Menu {
    public static void start() {
        MyList<Integer> testMyList = new MyArrayList<>();
        System.out.println(testMyList);
        System.out.println("isEmpty testMyList: " + testMyList.isEmpty());
        testMyList.add(-25);
        testMyList.add(1);
        testMyList.add(21);
        testMyList.add(32);
        testMyList.add(14);
        testMyList.add(32);
        testMyList.add(8);
        testMyList.add(32);
        testMyList.add(4);
        testMyList.add(22);
        testMyList.add(28);
        testMyList.add(32);
        testMyList.set(13, -32);
        testMyList.set(5, -32);
        testMyList.add(6, 101);
        System.out.println(testMyList);
        System.out.println("isEmpty testMyList: " + testMyList.isEmpty());
        System.out.println(testMyList.remove(10) + " удалённый элемент");
        System.out.println(testMyList.size());
        System.out.println(testMyList.contains(8) + " cont");
        System.out.println(testMyList.contains(256) + " cont");
        System.out.println(testMyList.remove(28) + " remove object");
        System.out.println(testMyList);
        System.out.println("get testMyList: " + testMyList.get(4));
        System.out.println(testMyList.indexOf(8));

        MyList<Integer> testMyList2 = new MyArrayList<>(14);
        System.out.println(testMyList2);
        testMyList2.add(18);
        testMyList2.add(14);
        testMyList2.add(10);
        testMyList2.add(7);
        System.out.println(testMyList2);
        System.out.println(testMyList2.size());

        MyList<String> stringMyList = new MyArrayList<>();
        stringMyList.add("Yes!!");
        stringMyList.add("Really");
        stringMyList.add("I did it");
        stringMyList.add("I learn");
        stringMyList.add("I ...");
        System.out.println(stringMyList.remove("I did it") + " remove object");
        System.out.println(stringMyList);

        System.out.println("get stringMyList: " + stringMyList.get(2));
        System.out.println(stringMyList.contains("Really") + " cont");

        MyList<String> stringMyListNew = new MyArrayList<>(stringMyList);
        System.out.println(stringMyListNew.contains("Really") + " really");
        stringMyListNew.add("Новая коллекция на основе предыдущей");
        System.out.println(stringMyListNew);

        MyList<String> stringMyList3 = new MyArrayList<>();
        stringMyList3.add("Начало колл3");
        stringMyList3.add("элемент");
        System.out.println(stringMyList3);
        stringMyList3.addAll(stringMyListNew);
        System.out.println(stringMyList3 + "добавили колл на колл");
    }
}

