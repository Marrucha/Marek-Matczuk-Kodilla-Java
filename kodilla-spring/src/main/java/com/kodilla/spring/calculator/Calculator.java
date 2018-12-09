package com.kodilla.spring.calculator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Autowired
    Display display;

    public double add(double a, double b){
        double result = a+b;
        display.displayValue(result);
        return result;
    }

    public double sub(double a, double b){
        double result = a-b;
        display.displayValue(result);
        return result;
    }

    public double div(double a, double b){
        double result ;
        try {
            result = a / b;
            display.displayValue(result);
            return result;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by 0");
            return 0;
        }
    }

    public double mul(double a, double b){
        double result = a*b;
        display.displayValue(result);
        return result;
    }

}
