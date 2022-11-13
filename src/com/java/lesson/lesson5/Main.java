package com.java.lesson.lesson5;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(str.length());

        Date date = new Date();
        System.out.println(date);







//        String text = "Egor Alla Miki Alex Antonina";
//        String regex = "A.+?a";
//
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(text);
//
//        while (matcher.find()){
//           int start =  matcher.start();
//           int end = matcher.end();
//            System.out.println(text.substring(start, end));
//            System.out.println(matcher.group());
//            System.out.println(matcher.replaceAll("Max"));
//        }



//        String[] seasons  = {str.split(" ")};
//        System.out.println(seasons);

//        String [] myArray = new String[];
//        myArray[] = str.split(" ");
//
//        System.out.println(myArray);


        System.out.println(str.split(" "));
        String[] str2 = str.split("");

        System.out.print(str2[0]);





    }
}
