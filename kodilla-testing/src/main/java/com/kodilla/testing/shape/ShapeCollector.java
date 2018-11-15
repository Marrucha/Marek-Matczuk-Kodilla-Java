package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {
    private ArrayList<Shape> figures = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public void removeFigure(Shape shape) {
        figures.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n < 0 || n > figures.size()) {
            return null;
        } else {
            Shape o = figures.get(n);
            return o;
        }
    }

    public String showFigures() {
        String string ="";
        for(Shape figura:figures){
            string = string + "\n" + figura;
        }
        return string;
    }

    public int getFiguresNumber() {
        return figures.size();
    }

    public static int countLines(String str){
        String[] lines = str.split("\r\n|\r|\n");
        return  lines.length;
    }
}


