package com.kodilla.testing.shape;

public class Square implements Shape{

    private double a;
    private String name;

    public Square(double a,  String name) {
        this.a = a;
        this.name = name;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getShapeField() {
        return Math.pow(a,2);
    }

    @Override
    public String toString() {
        return name + "field:" + getShapeField();
    }
}
