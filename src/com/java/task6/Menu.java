package com.java.task6;

import com.java.task6.container.Cone;
import com.java.task6.container.Cylindr;
import com.java.task6.container.Square;
import com.java.task6.deck.Deck;

public class Menu {
    public static void start() {
        printConeInfo();
        printSquareInfo();
        printCylindrInfo();
        printDeck();
    }

    public static void printConeInfo() {
        Cone cone = new Cone();
        System.out.println(cone.volume());
        System.out.println(cone.getMassWater());

        cone.print();
    }

    public static void printSquareInfo() {
        Square square = new Square();
        System.out.println(square.volume());
        System.out.println(square.getMassWater());

        square.print();
    }

    public static void printCylindrInfo() {
        Cylindr cylindr = new Cylindr();
        System.out.println(cylindr.volume());
        System.out.println(cylindr.getMassWater());

        cylindr.print();
    }

    public static void printDeck() {
        Deck deck = new Deck();
        Cone cone = new Cone();
        System.out.println(cone.getSize());
        deck.addType();
        deck.addDeck();
        deck.print();
    }
}
