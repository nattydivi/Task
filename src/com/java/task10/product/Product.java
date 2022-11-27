package com.java.task10.product;

import java.util.Date;

public class Product {
    java.util.Date dateOfManufacture;

    public Product(int id, ProductName name, Date myDate) {
        this.dateOfManufacture = myDate;
        //        id = productName.getId();
//        productName.getId() = id;
    }
}