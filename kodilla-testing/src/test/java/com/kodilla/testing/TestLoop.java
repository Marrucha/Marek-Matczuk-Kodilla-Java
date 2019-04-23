package com.kodilla.testing;

import org.junit.Assert;
import org.junit.Test;

public class TestLoop {
    @Test
    public void testLoop(){
        long sum = 0;
        for (int i = 1;i<1000;i++){
            sum+=i;
            System.out.println("[" + i + "]" + "equals sum =" + sum);
        }
        Assert.assertEquals(499500,sum);
    }
}
