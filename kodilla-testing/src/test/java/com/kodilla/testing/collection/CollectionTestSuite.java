package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;


public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator one = new OddNumbersExterminator();
        ArrayList<Integer> emptyArray = new ArrayList<Integer>();
        if(one.exterminator(emptyArray).size() == 0)
            System.out.println("Table is empty");
        Assert.assertEquals(0,one.exterminator(emptyArray).size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
     int zn=0;
        OddNumbersExterminator one = new OddNumbersExterminator();
        ArrayList<Integer> normalArray = new ArrayList<Integer>();
        normalArray.add(1);
        normalArray.add(2);
        normalArray.add(55);
        normalArray.add(66);
        normalArray.add(1566);
        normalArray.add(1555);

        ArrayList<Integer> evenArray = new ArrayList<Integer>();
        evenArray = one.exterminator(normalArray);

        for(Integer integ : evenArray){
            if (integ%2!=0) {
                zn = 1;
            }
        }
        if (zn != 0)
        System.out.println("ERROR:Table is populated by odd Number");
        else
        System.out.println("OK - Odd numbers were exterminated");
        Assert.assertEquals(0,zn);
    }
}
