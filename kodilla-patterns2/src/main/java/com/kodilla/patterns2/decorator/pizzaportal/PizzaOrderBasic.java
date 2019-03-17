package com.kodilla.patterns2.decorator.pizzaportal;

import java.math.*;

public class PizzaOrderBasic implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15.0);
    }

    @Override
    public String getDescription() {
        return "Your ordered pizza";
    }
}
