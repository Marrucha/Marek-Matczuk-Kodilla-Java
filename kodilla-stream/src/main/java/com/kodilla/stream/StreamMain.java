package com.kodilla.stream;

import com.kodilla.stream.beautyfier.PoemBeautyfier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpresionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        ExpresionExecutor expressionExecutor = new ExpresionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautyfier poemBeautyfier = new PoemBeautyfier();
        String textToBeatify = "Kolorowy";
        poemBeautyfier.beautyfy(textToBeatify, (text)-> "ABC"+text+"ABC");
        poemBeautyfier.beautyfy(textToBeatify, (text)-> text.toUpperCase());
        poemBeautyfier.beautyfy(textToBeatify, (text)-> text.toLowerCase());
        poemBeautyfier.beautyfy(textToBeatify, (text)-> text+text+text);
        poemBeautyfier.beautyfy(textToBeatify, (text)-> text.replace("Kolor","Tęcz"));


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}


