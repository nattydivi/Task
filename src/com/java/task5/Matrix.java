package com.java.task5;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    String[][] matrix = new String[10][10];
    String[] arrStringDiagonalSecondary = new String[10];
    String[] arrStringDiagonal = new String[10];
    String[] arrStringDiagonals = new String[arrStringDiagonal.length + arrStringDiagonalSecondary.length];
    double roundedNumber;
    public StringBuilder fromArray = new StringBuilder();

    public void consoleOutput() {
        makeMatrix();
        printMatrix();
        makeDiagonalSecondary();
        makeDiagonal();
        printEquals();
        makeDiagonals();
        printToRounding();
        printToStrings();
    }

    public String[][] makeMatrix() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                count++;
                if (count % 3 == 0) {
                    matrix[i][j] = conversionDoubleToStringSevenChar();
                } else matrix[i][j] = randomString();
            }
        }
        return matrix;
    }

    public String[] makeDiagonalSecondary() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i + j == 10 - 1)
                    arrStringDiagonalSecondary[i] = matrix[i][j];
            }
        }
        return arrStringDiagonalSecondary;
    }

    public String[] makeDiagonal() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j)
                    arrStringDiagonal[i] = matrix[i][j];
            }
        }
        return arrStringDiagonal;
    }

    public void printMatrix() {
        System.out.println("\n" + "Матрица из рандомных символов и чисел, состоящих из 7 символов, размером 10x10" + "\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("\n" + "Главная диагональ матрицы ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println("\n" + "Побочная диагональ матрицы ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j == 10 - 1) System.out.print(matrix[i][j] + " ");
            }
        }
    }

    public void printEquals() {
        boolean result = Arrays.equals(arrStringDiagonalSecondary, arrStringDiagonal);
        System.out.println("\n" + "Результат сравнения диагоналей: " + result);
    }

    public String[] makeDiagonals() {
        int counter = 0;
        for (int i = 0; i < arrStringDiagonal.length; i++) {
            arrStringDiagonals[i] = arrStringDiagonal[i];
            counter++;
        }
        for (int i = 0; i < arrStringDiagonalSecondary.length; i++) {
            arrStringDiagonals[counter++] = arrStringDiagonalSecondary[i];
        }
        return arrStringDiagonals;
    }

    public void printToStrings() {
        for (int i = 0; i < arrStringDiagonals.length; i++) {
            if (!arrStringDiagonals[i].contains(".")) {
                String charFromArr = arrStringDiagonals[i].substring(2, 4);
                if (!fromArray.isEmpty()) {
                    fromArray.append(", ");
                }
                fromArray.append(charFromArr);
            }
        }
        System.out.println(fromArray);
        System.out.println();
    }

    public void printToRounding() {
        double[] arrForDouble = new double[arrStringDiagonals.length];
        int counter = -1;
        for (int i = 0; i < arrStringDiagonals.length; i++) {
            if (arrStringDiagonals[i].contains(".")) {
                double numDouble = Double.parseDouble(arrStringDiagonals[i]);
                if (numDouble >= 1.7) {
                    roundedNumber = Math.ceil(numDouble);
                } else {
                    roundedNumber = Math.floor(numDouble);
                }
                counter++;
                arrForDouble[counter] = roundedNumber;
            }
        }
        String[] stringDouble = new String[counter + 1];
        for (int i = 0; i <= counter; i++) {
            stringDouble[i] = String.valueOf(arrForDouble[i]);
        }
        System.out.println(String.join("_", stringDouble));
    }

    public static String conversionDoubleToStringSevenChar() {
        final int max = 5;
        double random = randomDouble(max);
        String strDouble = String.valueOf(random);
        return strDouble.substring(0, 7);
    }

    public static double randomDouble(int max) {
        return Math.random() * ++max;
    }

    public static char randomCharLowerCase() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'a');
    }

    public static String randomString() {
        String strRandom;
        StringBuilder matrixValue = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            strRandom = String.valueOf(randomCharLowerCase());
            matrixValue.append(strRandom);
        }
        return matrixValue.toString();
    }
}
