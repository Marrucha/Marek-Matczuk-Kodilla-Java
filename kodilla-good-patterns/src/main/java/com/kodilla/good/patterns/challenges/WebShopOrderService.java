package com.kodilla.good.patterns.challenges;

public class WebShopOrderService implements OrderService {
    @Override
    public boolean processOrder(Order order, Payment payment) {
        System.out.println("Produkt został zamówiony");
        return false;
    }
}
