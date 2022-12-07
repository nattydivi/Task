package com.java.task10;

import com.java.task10.product.Product;
import com.java.task10.product.ProductName;
import com.java.task10.product.ProductStock;

import java.util.Arrays;
import java.util.Scanner;

import static com.java.task10.data.Date.parseDate;

public class Menu {
    public static void start() {
        ProductName productName;

//        Product soap5 = new Product(ProductName.SOAP.getId(), ProductName.SOAP, parseDate("20.05.22"));
//        Product soap6 = new Product(ProductName.SOAP.getId(), ProductName.SOAP, parseDate("25.06.22"));
//        Product soap1 = new Product(ProductName.SOAP.getId(), ProductName.SOAP, parseDate("10.01.22"));
//        Product soap8 = new Product(ProductName.SOAP.getId(), ProductName.SOAP, parseDate("08.08.22"));
//        Product razor = new Product(ProductName.RAZOR.getId(), ProductName.RAZOR, parseDate("10.04.22"));
//        Product razor7 = new Product(ProductName.RAZOR.getId(), ProductName.RAZOR, parseDate("10.07.22"));
//        Product showerGel = new Product(ProductName.SHOWER_GEL.getId(), ProductName.SHOWER_GEL, parseDate("10.04.22"));
//        Product showerGel9 = new Product(ProductName.SHOWER_GEL.getId(), ProductName.SHOWER_GEL, parseDate("02.09.22"));

        ProductName shampoo = Enum.valueOf(ProductName.class, "SHAMPOO");
        System.out.println(Arrays.toString(ProductName.values()));
//размер енам ниже, например 8. тогда последний элемент будет размер минус 1
        System.out.println(ProductName.values().length);
        System.out.println(ProductName.RAZOR.getId());
        System.out.println(shampoo);

        int sundayIndex = ProductName.SHAVING_FOAM.ordinal();
        System.out.println(sundayIndex);

//
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        ProductStock productStock = new ProductStock(new Product(ProductName.SHAMPOO,parseDate("10-04-22")));
//        System.out.println();

    }
}
