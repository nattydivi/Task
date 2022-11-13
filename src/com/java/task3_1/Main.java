package com.java.task3_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите номер месяца, чтобы узнать к какой поре года он относится");
        Scanner scanner = new Scanner(System.in);

        int numberMonth = scanner.nextInt();


        switch (numberMonth){
            case 12:
            case 1:
            case 2:
                printWinter();
                break;
            case 3:
            case 4:
            case 5:
                printSpring();
                break;
            case 6:
            case 7:
            case 8:
                printSummer();
                break;
            case 9:
                System.out.println("осень");
                break;
            case 10:
                System.out.println("осень");
                break;
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Вы ввели некорректное значение");

        }


    }

    private static void printSummer() {
        System.out.println("лето");
    }

    private static void printSpring() {
        System.out.println("весна");
    }

    private static void printWinter() {
        System.out.println("зима");
    }
}
