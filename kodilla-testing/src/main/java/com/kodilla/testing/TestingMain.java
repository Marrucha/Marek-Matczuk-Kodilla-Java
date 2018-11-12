package com.kodilla.testing;


import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {

        Calculator kalk = new Calculator();
        if (kalk.add(1,2)==3)
            System.out.println("Calculator.add() function is ok");
        if (kalk.substract(1,2)==-1)
            System.out.println("Calculator.substract() function is ok");
    }
}