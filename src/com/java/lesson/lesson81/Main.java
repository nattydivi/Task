package com.java.lesson.lesson81;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.setType(ProcessorType.BIT_32);

        print(processor);

//        ProcessorType bit32 = ProcessorType.BIT_32;
//        System.out.println(bit32.name());
//        ProcessorType[] values = ProcessorType.values();
//        ProcessorType type = ProcessorType.BIT_64;

    }

    private static void print(Processor processor) {
       if(processor.getType().equals(ProcessorType.BIT_32)){
           System.out.println("устарел");
       }
    }
}
