package com.kodilla.good.patterns.challenges;

public class WebShopDeliveryService implements DeliveryService {
    @Override
    public boolean processDelivery(Order order, Payment payment) {
        System.out.println("Produkt został dostarczony");
        return false;
    }
}
