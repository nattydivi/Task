package com.java.lesson.lesson83;

public class Runner {
    public static void main(String[] args) {
        String str = "flkhj dks,dbvhl";
        Integer resault = 1000;
        Box<String> box = new Box<>();
        box.setValue(str);

//        convertor(box);
        convertor(resault);
    }
    private static <T extends  Number> void convertor(T value){
        System.out.println(value);
    }

//    private static void convertor(Box<String> box){
//        String str = box.getValue();
//        System.out.println(str);
//    }
}
