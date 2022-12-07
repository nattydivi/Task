package com.java.task9;

import java.util.Scanner;

import static com.java.task9.Constants.*;

public class AssetTurnover {

    Scanner sc = new Scanner(System.in);

    public void calculation() throws InputTypeIsIncorrectException, LowerRevenueException, MathematicalException {
        double k = inputRevenueSixMonths() / inputValueOfAssets();
        if (inputRevenueSixMonths() < REVENUE_FIRST_QUARTER)
            throw new LowerRevenueException(LOWER_REWENUE);
        if (inputValueOfAssets() == 0 ||
                inputValueOfAssets() < 0)
            throw new MathematicalException(MATHEMATICAL_INCORRECT);
        else System.out.println("Оборачиваемость активов k = " + k);
    }

    @Override
    public String toString() {
        return "Справочно: ваша выручка за 1-ый квартал: " +
                REVENUE_FIRST_QUARTER;
    }

    private double inputRevenueSixMonths() throws InputTypeIsIncorrectException {
        print("Расчёт оборачиваемости активов ");
        print("Введите выручку за полугодие: ");
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else throw new InputTypeIsIncorrectException(INPUT_TYPE_IS_INCORRECT);
    }

    private double inputValueOfAssets() throws InputTypeIsIncorrectException {
        print("Введите cреднегодовую стоимость активов: ");
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else throw new InputTypeIsIncorrectException(INPUT_TYPE_IS_INCORRECT);
    }

    private void print(String s) {
        System.out.println(s);
    }
}