package com.java.task10.test;

public enum ProductName {

    SOAP(1011),
    SHAMPOO(1012),
    TOOTHPASTE(1013),
    SHOWER_GEL(1014),
    TOWEL(1015),
    RAZOR(1016),
    WASHCLOTH(1017),
    SHAVING_FOAM(1018);

//    этот енам для теста, сюда через рандом аксес добавляется продукт

    private final int id;

    public int getId() {
        return id;
    }

    ProductName(int id) {
        this.id = id;
    }
}
