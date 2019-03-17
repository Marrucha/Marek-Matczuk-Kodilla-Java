package com.kodilla.patterns2.decorator.pizzaportal;
import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;


public class PizzaOrderTestSuite {

        @Test
        public void testBasicPizzaOrderGetCost() {
            //Given
            PizzaOrder theOrder = new PizzaOrderBasic();
            //When
            BigDecimal calculatedCost = theOrder.getCost();
            //Then
            assertEquals(new BigDecimal(15), calculatedCost);

        }

        @Test
        public void testBasicPizzaOrderGetDescription() {
            //Given
            PizzaOrder theOrder = new PizzaOrderBasic();
            //When
            String description = theOrder.getDescription();
            //Then
            assertEquals("Your ordered pizza", description);
        }

        @Test
        public void testBasicPizzaWithDoubleCheseseDeliveryGetCost() {
            //Given
            PizzaOrder theOrder = new PizzaOrderBasic();
            theOrder = new DoubleCheeseDecorator(theOrder);
            theOrder = new DeliveryDecorator(theOrder);
            //When
            BigDecimal calculatedCost = theOrder.getCost();
            //Then
            assertEquals(new BigDecimal(26.5), calculatedCost);

        }

        @Test
        public void testPizzaNaWypasie() {
            //Given
            PizzaOrder theOrder = new PizzaOrderBasic();
            theOrder = new ChampinionesDecorator(theOrder);
            theOrder = new DoubleCheeseDecorator(theOrder);
            theOrder = new RucolaDecorator( theOrder);
            theOrder = new SalamiDecorator(theOrder);
            theOrder = new TomatoSauceDecorator(theOrder);
            theOrder = new DeliveryDecorator(theOrder);

            //When
            String description = theOrder.getDescription();
            double valuePizza = theOrder.getCost().doubleValue();
            //Then
            assertEquals("Your ordered pizza" + " + champiniones " +
                    "+ additional cheese + rucola + salami + tomato sauce " +
                    "+ delivery", description);
            assertEquals(35.2,valuePizza,0.0001);
        }
}
