package com.kodilla.testing.shape;

public class Circle implements Shape{
    private double r;
    private String name;

    public Circle(double r,  String name) {
        this.r = r;
        this.name = name;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getShapeField() {
        return Math.PI * Math.pow(r,2);
    }

    @Override
    public String toString() {
        return name + "field:" + getShapeField();
    }
}
