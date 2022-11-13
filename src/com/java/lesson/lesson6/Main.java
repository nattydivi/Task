package com.java.lesson.lesson6;

public class Main {
    public static void main(String[] args) {
       Dog dog = new Dog();
       Dog dog2 = new Dog();

       Dog.setAddress("Kommunarov, 12"); // статическая  создана в классе дог и обращаемся к классу с большой буквы, а там делаем гет и сет
       dog2.setName("Nik");

        String name = "Wlad";
        String alina = "Alina";
        String dima = "Dima";


        hello();

        hello(name, alina, dima);



    }
    public static void hello(){
        System.out.println("hello");
        say();
    }
    private static void say (){
        System.out.println("hi");
    }

    private static void hello(String...name){
        System.out.println("hello " + name);
    }
}
