package com.java.task6.container;

import static com.java.task6.Constants.DENSITY_OF_WATER_HIGH;
import static com.java.task6.Constants.DENSITY_OF_WATER_LOW;

public class Cone extends Container {
    private final String size = defineSize();

    {
        type = "Type: cone ";
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
            return Math.PI * diagonalSmall / 4 * height / 3;
        } else return Math.PI * diagonalLarge / 4 * height / 3;
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
            Cone[] cone = new Cone[1];
            cone[0] = new Cone();
            System.out.println(cone[0]);
        }
    }
}
