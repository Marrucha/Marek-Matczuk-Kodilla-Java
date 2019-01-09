package com.kodilla;

public class FirstClass {
    public static void main(String[] args) {
        int x = 1;
        int y = 3;

        System.out.println(x == (x = y));
        x = 1;
        System.out.println((x = y) == x);
    }

}
