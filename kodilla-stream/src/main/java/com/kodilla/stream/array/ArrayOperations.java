package com.kodilla.stream.array;

import java.util.*;
import java.util.stream.*;

public interface ArrayOperations {
    static double getAverage(int[] numbers){
         Arrays.stream(numbers, 0, numbers.length)
                .forEach(System.out::println);

        OptionalDouble average = Arrays.stream(numbers, 0, numbers.length)
                .average();

        return average.getAsDouble();
    }
}
