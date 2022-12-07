package com.java.task10.product;

import java.io.File;

import static com.java.task10.data.Date.parseDate;

public class ProductStock {
    private ProductName productName;
    private final Product product;

    Product soap5 = new Product(ProductName.SOAP.getId(), ProductName.SOAP, parseDate("20.05.22"));
    Product soap6 = new Product(ProductName.SOAP.getId(), ProductName.SOAP, parseDate("25.06.22"));
    Product soap1 = new Product(ProductName.SOAP.getId(), ProductName.SOAP, parseDate("10.01.22"));
    Product soap8 = new Product(ProductName.SOAP.getId(), ProductName.SOAP, parseDate("08.08.22"));
    Product razor = new Product(ProductName.RAZOR.getId(), ProductName.RAZOR, parseDate("10.04.22"));
    Product razor7 = new Product(ProductName.RAZOR.getId(), ProductName.RAZOR, parseDate("10.07.22"));
    Product showerGel = new Product(ProductName.SHOWER_GEL.getId(), ProductName.SHOWER_GEL, parseDate("10.04.22"));
    Product showerGel9 = new Product(ProductName.SHOWER_GEL.getId(), ProductName.SHOWER_GEL, parseDate("02.09.22"));

    ProductName penny = Enum.valueOf(ProductName.class, "PENNY");
    File products = new File("");

    public ProductStock(Product product) {
        this.product = product;
    }

//    public static void main(String[] args) {
//        System.out.println();
//    }

    @Override
    public String toString() {
        return "ProductStock{" +
                "product=" + product +
                '}';
    }
}
