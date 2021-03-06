package com.kodilla.testing.shape;

public class Circle implements Shape{
    private final String name;
    private final double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getShapeName() {
        return name;
    }


    public double getField() {
        return Math.PI*Math.pow(radius,2);

    }

    @Override
    public String toString() {
        return  name;
    }
}
