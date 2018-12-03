package com.kodilla.good.patterns.challenges;

public class Delivery {
    private Order order;
    private boolean deliveryStatus;

    public Delivery(Order order, boolean deliveryStatus) {
        this.order = order;
        this.deliveryStatus = deliveryStatus;
    }

    public Order getOrder() {
        return order;
    }

    public boolean isDeliveryStatus() {
        return deliveryStatus;
    }
}
