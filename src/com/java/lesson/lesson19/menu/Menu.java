package com.java.lesson.lesson19.menu;

import java.util.Scanner;

public class Menu {
    private int value;
    private String numberMenu;
    Scanner scan = new Scanner(System.in);
    MenuWorker menuWorker = new MenuWorker();
    MenuClient menuClient = new MenuClient();

    public static void start() {
        Menu menu = new Menu();
        menu.menu();
    }

    public void menu() {
        while (!"3".equals(numberMenu)) {
            print("1. Вход для сотрудников магазина (работа с базой товаров), введите 1");
            print("2. Вход для клиентов (оформить заказ) введите 2");
            print("3. Для выхода из приложения введите 3");
            numberMenu = scan.next();

            try {
                value = Integer.parseInt(numberMenu);
            } catch (NumberFormatException e) {
                print("Неверный ввод");
            }

            callMethod();
        }
        print("До свидания!");
        scan.close();
    }

    private void callMethod() {
        switch (value) {
            case 1 -> menuWorker.callMenuWorker();
            case 2 -> menuClient.callMenuClient();
        }
    }

    private void print(String value) {
        System.out.println(value);
    }
}