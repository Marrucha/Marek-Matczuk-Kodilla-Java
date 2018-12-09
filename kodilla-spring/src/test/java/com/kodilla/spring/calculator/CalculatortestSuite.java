package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatortestSuite {
    @Test
    public void checkCalculatorOperations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        Double resultAdd = calculator.add(2, 3);
        Assert.assertEquals(5.0,resultAdd,0.0001);

        Double resultMul = calculator.mul(2, 3);
        Assert.assertEquals(6.0,resultMul,0.0001);

        Double resultDiv = calculator.div(3, 3);
        Assert.assertEquals(1.0,resultDiv,0.0001);

        Double resultSub = calculator.sub(2, 3);
        Assert.assertEquals(-1,resultSub,0.0001);

    }
}
