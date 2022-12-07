package com.java.task10.menu;

import java.util.Scanner;

public class MenuWorker {
    private int value;
    private String numberMenu;
    Scanner scan = new Scanner(System.in);

    public void callMenuWorker() {
        while (!"4".equals(numberMenu)) {
            print("1. Для добавления товара введите 1");
            print("2. Для удаления товара введите 2");
            print("3. Для просмотра списка товаров введите 3");
            print("4. Для выхода из приложения введите 4");
            numberMenu = scan.next();

            try {
                value = Integer.parseInt(numberMenu);
            } catch (NumberFormatException e) {
                print("Неверный ввод");
            }

            callMethod();
        }
        print("До свидания!");
    }

    private void callMethod() {
        switch (value) {
            case 1:
                // вызов метода 1 добавления товара
                break;
            case 2:
                // вызов метода 2 удаления товара
                break;
            case 3:
                // вызов метода 3 просмотра списка товаров
        }
    }

    private void print(String value) {
        System.out.println(value);
    }
}
