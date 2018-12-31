package com.kodilla.patterns.builder.bigMac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigMacNew() {
        //Given
        try {
            BigMac bigMac = new BigMac.BigMacBuilder()
                    .bun(BigMac.BUN_SEZAM)
                    .sauce(BigMac.SAUCE_1000_ISLANDS)
                    .burgers(7)
                    .ingredient("Sałata")
                    .ingredient("Cebula")
                    .ingredient("Krewetki")
                    .build();

            System.out.println(bigMac);
            //When
            int howManyIngredients = bigMac.getIngredients().size();
            //Then
            Assert.assertEquals(3, howManyIngredients);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
