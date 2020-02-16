package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private String name;
    private double height;
    private double side;

    public Triangle(String name, double height, double side) {
        this.name = name;
        this.height = height;
        this.side = side;
    }

    public String getShapeName() {
     return name;
    }


    public double getField() {
        return height*side*0.5;

    }

    @Override
    public String toString() {
        return name;
    }
}
