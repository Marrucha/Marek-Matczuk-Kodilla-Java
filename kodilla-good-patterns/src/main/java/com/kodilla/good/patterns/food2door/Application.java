package com.kodilla.good.patterns.food2door;

import java.time.*;

public class Application {

    public static void main(String [] args) {

        // testowe dane dla 1-szego zamówienia
        Article art1 = new Article(123, "Marchewka","Vegetables");
        Supplier sup1 = new Supplier(111,"Extra Food Shop","Vegetables", true);
        int quantity = 101;
        LocalTime localTime1 = LocalTime.of(7,45);
        Order order1 = new Order(sup1,art1,quantity,localTime1);
        OrdersProcessor orderProcessor1 = new OrdersProcessor(new ExtraFoodShop_ProducerService());
        boolean proc1 = orderProcessor1.processOrder(order1);

        if (proc1) {
            System.out.println("Order from: " + order1.getSupplier().getSuppName() + " was succesfully proccessed");
        } else {
            System.out.println("Order from: " + order1.getSupplier().getSuppName() + " was impossible");
        }

        // testowe dane dla 2-go zamówienia
        Article art2 = new Article(321, "No Gluten Milk","Gluten Free");
        Supplier sup2 = new Supplier(112,"Gluten Free Shop","Vegetables", true);
        int quantity2 = 12;
        LocalTime localTime2 = LocalTime.of(8,45);
        Order order2 = new Order(sup2,art2,quantity2,localTime2);
        OrdersProcessor orderProcessor2 = new OrdersProcessor(new GlutenFreeShop_ProducerService());
        boolean proc2 = orderProcessor2.processOrder(order2);

        if (proc2) {
            System.out.println("Order from: " + order2.getSupplier().getSuppName() + " was succesfully proccessed");
        } else {
            System.out.println("Order from: " + order2.getSupplier().getSuppName() + " was impossible");
        }

        // testowe dane dla 3-go zamówienia
        Article art3 = new Article(421, "Bio basilia","BioSpices");
        Supplier sup3 = new Supplier(113,"Healthy Shop","BioSpices", true);
        int quantity3 = 12;
        LocalTime localTime3 = LocalTime.of(22,45);
        Order order3 = new Order(sup3,art3,quantity3,localTime3);
        OrdersProcessor orderProcessor3 = new OrdersProcessor(new HealthyShop_ProducerService());
        boolean proc3 = orderProcessor3.processOrder(order3);

        if (proc3) {
            System.out.println("Order from: " + order3.getSupplier().getSuppName() + " was succesfully proccessed");
        } else {
            System.out.println("Order from: " + order3.getSupplier().getSuppName() + " was impossible");
        }


    }
}



