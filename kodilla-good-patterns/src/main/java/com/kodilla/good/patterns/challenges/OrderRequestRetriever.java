package com.kodilla.good.patterns.challenges;

import java.util.*;

public class OrderRequestRetriever {
    public OrderRequest retrieve (){
        User user = new User ("Marek Matczuk", 12345);
        Article article = new Article (98765,"Myszka laserowa Logitech D123");
        double price = 1345.99;
        Order order = new Order (999,article,user,123.55);
        Payment payment = new Payment (order, "Credit Card", true);
        Delivery delivery = new Delivery(order,true);
        List<String> opinions = new ArrayList<String>();
        opinions.add("Zajebista firma");
        opinions.add("Oszuści i złodzieje");
        opinions.add("Super produkt i dostawa");

        Opinion opinion = new Opinion(order,opinions);

        return new OrderRequest(order,payment,delivery,opinion);
    }
}
