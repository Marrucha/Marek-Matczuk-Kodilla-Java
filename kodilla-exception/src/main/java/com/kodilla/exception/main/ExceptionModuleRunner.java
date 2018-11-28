package com.kodilla.exception.main;

import com.kodilla.exception.test.FirstChallange;


public class ExceptionModuleRunner {
    public static void main (String args[]){

        //   FileReader fileReader = new FileReader();
        //   fileReader.readFile();

        FirstChallange firstChallenge = new FirstChallange();
        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        }
        catch (ArithmeticException a){
            System.out.println("Division by 0");
        }

        finally {
            System.out.println("\n" + "REMEMBER!!! - division by Zero is not possible");
        }

    }
}


