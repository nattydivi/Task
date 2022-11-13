package com.java.task8;

import com.java.task7.Robot;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Menu.start();

        Robot robot = new Robot("jg");
        Robot robot2 = new Robot("ndnm");
        Robot robot3 = new Robot("nsnsn");

        List<Robot> robots = new ArrayList<>();
        robots.add(robot2);
        robots.add(robot);


        System.out.println(robots.size());
    }
}
