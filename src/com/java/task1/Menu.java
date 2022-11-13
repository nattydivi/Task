package com.java.task1;
public class Menu {
    public void consoleOutput() {
        printWhile();
        printGet();
        printDoWhile();
        printArrayCatsForEach();
        printCatsEquals();
    }

    public void printWhile() {
        int i = 1;
        while (i <= 10) {
            Cat cat = new Cat();
            System.out.println(i + ".Name: " + cat.defaultName + ", Age: " + cat.defaultAge);
            i++;
        }
    }

    public void printGet() {
        for (int i = 1; i <= 10; i++) {
            Cat cat = new Cat();
            cat.setNameCats("Mike"); //(в задании сказано, что имена рандомные, поэтому я в class Cat{} в сеттерах прописала рандом)
            cat.setAgeCats(3); // (если там в сеттерах убрать рандом, то выведет заданные имя Майк и возраст 3)
            System.out.println(i + ".Name: " + cat.getNameCats() + ", Age: " + cat.getAgeCats());
        }
    }

    public void printDoWhile() {
        int i = 10;
        do {
            Cat catDo = new Cat();
            System.out.println(catDo);
            i--;
        } while (i > 0);
    }

    public void printArrayCatsForEach() {
        Cat[] arrCat = new Cat[5];
        for (int i = 0; i < 5; i++) {
            arrCat[i] = new Cat();
        }

        for (Cat indexOfArrCat : arrCat) {
            System.out.println(indexOfArrCat);
        }
    }

    public void printCatsEquals() {
        Cat cat1 = new Cat();
        cat1.setNameCats("Atlantis");
        cat1.setAgeCats(7);

        Cat cat2 = new Cat();
        cat2.setNameCats("Atlantis");
        cat2.setAgeCats(7);

        System.out.println(cat1.equals(cat2));
    }
}