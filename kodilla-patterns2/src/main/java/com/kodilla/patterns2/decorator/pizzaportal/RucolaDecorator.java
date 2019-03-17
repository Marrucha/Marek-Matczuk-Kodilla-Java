package com.kodilla.patterns2.decorator.pizzaportal;

import java.math.*;

public class RucolaDecorator extends AbstractPizzaOrderDecorator {
    protected RucolaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3.0));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + rucola";
    }
}
