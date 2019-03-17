package com.kodilla.patterns2.decorator.pizzaportal;

import java.math.*;

public class ChampinionesDecorator extends AbstractPizzaOrderDecorator{
    protected ChampinionesDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2.1));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + champiniones";
    }
}
