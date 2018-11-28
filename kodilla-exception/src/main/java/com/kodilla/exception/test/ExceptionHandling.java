package com.kodilla.exception.test;

public class ExceptionHandling {

    public String processErrors(double x, double y){
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
         String result = secondChallenge.probablyIWillThrowException(x,y);
            return result;
        } catch (Exception e){
            return "Error. Looks like figures are not ok";
        } finally {
            System.out.println("All was executed !!! - bez sensu ale treningowo");
        }

    }

}
