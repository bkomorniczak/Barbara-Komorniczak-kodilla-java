package com.kodilla.testing.shape;

public class Square implements Shape{
    private String name;
    private double side;

    public Square(String name, double side) {
        this.name = name;
        this.side = side;
    }

    public String getShapeName() {
        return name;
    }


    public double getField() {
        return Math.pow(side,2);

    }

    @Override
    public String toString() {
        return name;
    }
}
