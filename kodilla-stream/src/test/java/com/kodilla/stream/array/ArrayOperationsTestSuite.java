package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class ArrayOperationsTestSuite implements ArrayOperations {
    @Test
    public void testGetAverage(){
        Random random = new Random();
        int sum = 0;
        double avgSimple = 0.00;
        int[] tab = new int [100];

        for(int i = 0;i<tab.length;i++){
            tab[i]= random.nextInt(100);
            sum +=tab[i];
        }

        avgSimple = sum/(tab.length*1.000);

        Assert.assertEquals(avgSimple, ArrayOperations.getAverage(tab),0.01);
    }
}
