package com.java.task6.deck;

import com.java.task6.container.Cone;
import com.java.task6.container.Cylindr;
import com.java.task6.container.Square;

import java.util.Objects;
import java.util.Random;

public class Deck {
    private String size;
    protected Cone cone = new Cone();
    protected Cylindr cylindr = new Cylindr();
    protected Square square = new Square();

    Deck[] deckLarge = new Deck[2];
    Deck[] deckSmall = new Deck[4];

    public Deck(Cone cone) {
        this.cone = cone;
    }

    public Deck(Cylindr cylindr) {
        this.cylindr = cylindr;
    }

    public Deck(Square square) {
        this.square = square;
    }

    public Deck() {

    }

    int typeContainer() {
        return random(1, 3);
    }

    public void addType() {
        switch (typeContainer()) {
            case 1:
                new Deck(cone);
                break;
            case 2:
                new Deck(cylindr);
                break;
            case 3:
                new Deck(square);
                break;
        }
    }

    public void addDeck() {
        for (int i = 0; i < 2; i++) {
            if (Objects.equals(cone.getSize(), "l")) {
                deckLarge[i] = new Deck(cone);
            }
            if (Objects.equals(cylindr.getSize(), "l")) {
                deckLarge[i] = new Deck(cylindr);
            }
            if (Objects.equals(square.getSize(), "l")) {
                deckLarge[i] = new Deck(square);
            }
        }
        for (int i = 0; i < 4; i++) {
            if (Objects.equals(cone.getSize(), "s")) {
                deckSmall[i] = new Deck(cone);
            }
            if (Objects.equals(cylindr.getSize(), "s")) {
                deckSmall[i] = new Deck(cylindr);
            }
            if (Objects.equals(square.getSize(), "s")) {
                deckSmall[i] = new Deck(square);
            }
        }
    }

    public void print() {
        for (Deck i : deckLarge) {
            System.out.println(i);
        }

        for (Deck i : deckSmall) {
            System.out.println(i);
        }
    }

    public int random(int startNum, int endNum) {
        Random random = new Random();
        return random.nextInt(endNum - startNum + 1) + startNum;
    }
}
