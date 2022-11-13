package com.java.task7;

public class Factory {
    public static void start() {
        Robot robot = new Robot("Mea");
        robot.setBodyType(BodyType.MINI);
        robot.setHeadType(HeadType.CAT);
        print(robot);

        Robot robot2 = new Robot("Kitty");
        robot2.setBodyType(BodyType.NORMAL);
        robot2.setHeadType(HeadType.CAT);
        print(robot2);

        Robot robot3 = new Robot("Sally");
        robot3.setBodyType(BodyType.LARGE);
        robot3.setHeadType(HeadType.CAT);
        print(robot3);

        Robot robot4 = new Robot("Alf");
        robot4.setBodyType(BodyType.MINI);
        robot4.setHeadType(HeadType.DOG);
        print(robot4);

        Robot robot5 = new Robot("Kip");
        robot5.setBodyType(BodyType.NORMAL);
        robot5.setHeadType(HeadType.DOG);
        print(robot5);

        Robot robot6 = new Robot("Sam");
        robot6.setBodyType(BodyType.LARGE);
        robot6.setHeadType(HeadType.DOG);
        print(robot6);

        Robot robot7 = new Robot("Barnie");
        robot7.setBodyType(BodyType.MINI);
        robot7.setHeadType(HeadType.BEAR);
        print(robot7);

        Robot robot8 = new Robot("Mick");
        robot8.setBodyType(BodyType.NORMAL);
        robot8.setHeadType(HeadType.BEAR);
        print(robot8);

        Robot robot9 = new Robot("Vik");
        robot9.setBodyType(BodyType.LARGE);
        robot9.setHeadType(HeadType.BEAR);
        print(robot9);
    }

    private static void print(Robot robot) {
        System.out.println(robot);
    }
}
