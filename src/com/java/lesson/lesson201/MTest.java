package com.java.lesson.lesson201;

import java.util.Arrays;
import java.util.List;

public class MTest {

    public static void main(String[] args) {
        Integer value = 1;

        change(value);
        System.out.println(value);


//        пару задач с тинькофф

        int k = 5;
        for (short i = 0; i < 5; ) {
            i++;
            if (i % 2 != 0) {
                continue;
            }
            k += 3;
        }
        System.out.println(k);


//        Integer[] ageArray;
//        try {
//            String age = "29";
//            ageArray = new Integer[]{Integer.parseInt(age)};
//        } catch (NumberFormatException nfe) {
//            System.out.println("Error parsing age");
//        }
//        System.out.println(Arrays.toString(ageArray));



//        public final Integer doNothingForNow(int... numbers, boolean needSum) {
//            return null;
//        }

//        List<String> catNames = Arrays.asList("Mira", "Aisa");
//        catNames.add("Jiko");
//        System.out.println(catNames);

    }

    public static void change(Integer value) {
        ++value;
    }

}