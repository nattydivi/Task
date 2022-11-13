package com.java.task6.container;

import java.util.Random;

abstract class Container {
    protected String type;
    protected float height;
    protected double diagonalSmall = 10;
    protected double diagonalLarge = 20;

    abstract int addDiagonal();

    abstract String defineSize();

    abstract int addWater();

    abstract double volume();

    abstract long getMassWater();


    public Container() {
        this.height = random(10, 100);
    }

    @Override
    public String toString() {
        return type + defineSize() + " Mass Water: " + getMassWater();
    }

//    @Override
//    public String toString() {
//        return type + defineSize() + " Height container: " + height + " Mass Water: " + getMassWater() + " Density of water: " + addWater() * 1000;
//    }

    public String getType() {
        return type;
    }

    public int random(int startNum, int endNum) {
        Random random = new Random();
        return random.nextInt(endNum - startNum + 1) + startNum;
    }
}
