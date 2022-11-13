package com.java.task4;

import java.util.Random;

public class Cat {
    String defaultName = "Atlantis";
    int defaultAge = 7;
    private String nameCats;
    private int ageCats;

    public String getNameCats() {
        return nameCats;
    }

    public void setNameCats(String nameCats) {
        this.nameCats = randomName();
    }

    public int getAgeCats() {
        return ageCats;
    }

    public void setAgeCats(int ageCats) {
        this.ageCats = randomAge(1, 28);
    }

    //Для того, чтобы вывести данные котов через конструктор в цикле do while класса Menu
    // создала public Cat() с рандомными данными и переопределила, что будет выводить @Override toString()
    public Cat() {
        this.nameCats = randomName();
        this.ageCats = randomAge(1, 28);
    }

    @Override
    public String toString() {
        return "Name: " + nameCats + ". Age: " + ageCats;
    }

    public int randomAge(int startNum, int endNum) {
        Random random = new Random();
        return random.nextInt(endNum - startNum + 1) + startNum;
    }

    //Для генерации имени котов использована заглавная буква символов, преобразованная в строку
    //и символы нижнего регистра в цикле for
    public static char randomCharUpperCase() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'A');
    }

    public static char randomCharLowerCase() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'a');
    }

    public static String randomName() {
        String strRandom;
        String catName = String.valueOf(randomCharUpperCase());
        for (int i = 0; i < 7; i++) {
            strRandom = String.valueOf(randomCharLowerCase());
            catName += strRandom;
        }
        return catName;
    }

    public boolean equals(Cat cat) {
        return this.defaultName == cat.defaultName && this.defaultAge == cat.defaultAge;
    }
    // Сделала equals и применила на 2х котов по примеру с https://javarush.ru/groups/posts/equals-java-sravnenie-strok

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Cat cat)) return false;
//        return defaultAge == cat.defaultAge && defaultName.equals(cat.defaultName);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(defaultName, defaultAge);
//    }
}