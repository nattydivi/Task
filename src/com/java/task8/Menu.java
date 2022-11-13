package com.java.task8;

import com.java.task7.Robot;

public class Menu {
    public static void start() {
        Robot robot = new Robot("jg");
        Robot robot2 = new Robot("ndnm");
        Robot robot3 = new Robot("nsnsn");

        MyList <Robot> stringMyList = new MyArrayList<>();
        MyList <Robot> stringMyList2 = new MyArrayList<>(12);

        System.out.println(stringMyList);
        System.out.println(stringMyList2);



        stringMyList2.add(robot);
        stringMyList2.add(robot2);


//        System.out.println(myArrayList1.length);

    }


//    private void print(value) {
//        System.out.println(value);
//    }

}

