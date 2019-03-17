package com.kodilla.patterns2.decorator.pizzaportal;

import java.math.*;

public class TomatoSauceDecorator extends AbstractPizzaOrderDecorator {
    protected TomatoSauceDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(0.5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + tomato sauce";
    }
}
