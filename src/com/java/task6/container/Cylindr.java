package com.java.task6.container;

import static com.java.task6.Constants.DENSITY_OF_WATER_HIGH;
import static com.java.task6.Constants.DENSITY_OF_WATER_LOW;

public class Cylindr extends Container {
    private final String size = defineSize();

    {
        type = "Type: cylindr ";
    }

    @Override
    int addDiagonal() {
        return random(1, 2);
    }

    @Override
    String defineSize() {
        if (addDiagonal() == 1) {
            return "s";
        } else return "l";
    }

    @Override
    int addWater() {
        return random(1, 2);
    }

    @Override
    public double volume() {
        if (addDiagonal() == 1) {
            return Math.PI * diagonalSmall / 4 * height;
        } else return Math.PI * diagonalLarge / 4 * height;
    }

    @Override
    public long getMassWater() {
        if (addWater() == 1) {
            return Math.round(volume() * DENSITY_OF_WATER_LOW);
        } else return Math.round(volume() * DENSITY_OF_WATER_HIGH);
    }

    public String getSize() {
        return size;
    }

    public void print() {
        for (int i = 1; i <= 2; i++) {
            Cylindr[] cylindr = new Cylindr[1];
            cylindr[0] = new Cylindr();
            System.out.println(cylindr[0]);
        }
    }
}