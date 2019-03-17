package com.kodilla.patterns2.decorator.pizzaportal;

import java.math.*;

public class SalamiDecorator extends AbstractPizzaOrderDecorator {
    protected SalamiDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3.1));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + salami";
    }
}
