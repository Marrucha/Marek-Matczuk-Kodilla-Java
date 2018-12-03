package com.kodilla.good.patterns.challenges;

public class Payment {
    Order order;
    String paymentType;
    boolean paymentDone;

    public Payment(Order order, String paymentType, boolean paymentDone) {
        this.order = order;
        this.paymentType = paymentType;
        this.paymentDone = paymentDone;
    }

    public Order getOrder() {
        return order;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public boolean isPaymentDone() {
        return paymentDone;
    }
}
