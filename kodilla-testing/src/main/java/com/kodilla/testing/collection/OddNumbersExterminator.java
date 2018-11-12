package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminator(ArrayList<Integer> numbers){

        ArrayList<Integer> evenList = new ArrayList<Integer>();
        for (Integer num1: numbers){
            if (num1%2==0)
                evenList.add(num1);
        }
       return evenList;
    }

}
