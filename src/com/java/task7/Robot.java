package com.java.task7;

public class Robot {
    private BodyType bodyType;
    private HeadType headType;
    private String name;

    @Override
    public String toString() {
        return "Robot {" +
                "bodyType: " + bodyType +
                ", headType: " + headType +
                ", name: '" + name + '\'' +
                ", functions: say: " + headType.say() +
                ", " + headType.movementEye() +
                '}';
    }

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public void setHeadType(HeadType headType) {
        this.headType = headType;
    }
}
