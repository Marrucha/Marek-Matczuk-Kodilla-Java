package com.kodilla.patterns2.decorator.pizzaportal;

import java.math.*;

public class DeliveryDecorator extends AbstractPizzaOrderDecorator {
    protected DeliveryDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10.0));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + delivery";
    }
}
