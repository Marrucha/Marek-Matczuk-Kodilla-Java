package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private double h;
    private double a;
    private String name;

    public Triangle(double h, double a, String name) {
        this.h = h;
        this.a = a;
        this.name = name;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getShapeField() {
        double v = a * 1 / 2 * h;
        return v;
    }

    @Override
    public String toString() {
        return name + " field:" + getShapeField();
    }
}
