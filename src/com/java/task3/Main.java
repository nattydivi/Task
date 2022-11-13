package com.java.task3;

import java.util.Scanner;

import static com.java.task3.Rainbow.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7, и вы узнаете соответсвующий цвет:");

        displayColor(sc);

    }

    private static void displayColor2(Scanner sc) {
        if (sc.hasNextInt()) {
            int number2 = sc.nextInt();
            if (number2 == 1) {
                System.out.print("Спасибо! Ваш цвет " + RED);
            }
            if (number2 == 2){
                System.out.print("Спасибо! Ваш цвет " + ORANGE);
            }
            if (number2 == 3){
                System.out.print("Спасибо! Ваш цвет " + YELLOW);
            }
            if (number2 == 4){
                System.out.print("Спасибо! Ваш цвет " + GREEN);
            }
            if (number2 == 5){
                System.out.print("Спасибо! Ваш цвет " + LIGHT_BLUE);
            }
            if (number2 == 6){
                System.out.print("Спасибо! Ваш цвет " + BLUE);
            }
            if (number2 == 7){
                System.out.print("Спасибо! Ваш цвет " + VIOLET);
            }
            if (number2 < 1 || number2 > 7){
                System.out.println("Вы ввели число не в том диапазоне. Перезапустите программу и попробуйте снова!");
            }
        } else {
            System.out.println("Вы ввели не число. Перезапустите программу и попробуйте снова!");
        }
    }

    private static void displayColor(Scanner sc) {
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            if (number == 1) {
                System.out.println("Спасибо! Ваш цвет " + RED + "." + " Введите дополнительный цвет" );
                displayColor2(sc);
                System.out.print("-" + RED);
            }
            if (number == 2){
                System.out.println("Спасибо! Ваш цвет " + ORANGE + "." + " Введите дополнительный цвет" );
                displayColor2(sc);
                System.out.print("-" + ORANGE);
            }
            if (number == 3){
                System.out.println("Спасибо! Ваш цвет " + YELLOW + "." + " Введите дополнительный цвет" );
                displayColor2(sc);
                System.out.print("-" + YELLOW);
            }
            if (number == 4){
                System.out.println("Спасибо! Ваш цвет " + GREEN + "." + " Введите дополнительный цвет"  );
                displayColor2(sc);
                System.out.print("-" + GREEN);
            }
            if (number == 5){
                System.out.println("Спасибо! Ваш цвет " + LIGHT_BLUE + "." + " Введите дополнительный цвет" );
                displayColor2(sc);
                System.out.print("-" + LIGHT_BLUE);
            }
            if (number == 6){
                System.out.println("Спасибо! Ваш цвет " + BLUE + "." + " Введите дополнительный цвет" );
                displayColor2(sc);
                System.out.print("-" + BLUE);
            }
            if (number == 7){
                System.out.println("Спасибо! Ваш цвет " + VIOLET + "." + " Введите дополнительный цвет");
                displayColor2(sc);
                System.out.print("-" + VIOLET);
            }
            if (number < 1 || number > 7){
                System.out.println("Вы ввели число не в том диапазоне. Перезапустите программу и попробуйте снова!");
            }
        } else {
            System.out.println("Вы ввели не число. Перезапустите программу и попробуйте снова!");
        }
    }

   


}
