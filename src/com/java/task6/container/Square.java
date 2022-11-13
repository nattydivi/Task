package com.java.task6.container;

import static com.java.task6.Constants.DENSITY_OF_WATER_HIGH;
import static com.java.task6.Constants.DENSITY_OF_WATER_LOW;

public class Square extends Container {
    private final String size = defineSize();

    {
        type = "Type: square ";
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
            return Math.pow(diagonalSmall, 2) * height;
        } else return Math.pow(diagonalLarge, 2) * height;
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

    /**
     * 1 элемент массива, для проверки рандома и вывода на консоль
     */
    public void print() {
        for (int i = 1; i <= 2; i++) {
            Square[] square = new Square[1];
            square[0] = new Square();
            System.out.println(square[0]);
        }
    }
}
