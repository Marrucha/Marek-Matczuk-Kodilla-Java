package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private Order order;
    private Payment payment;
    private Delivery delivery;
    private Opinion opinion;

    public OrderRequest(Order order, Payment payment, Delivery delivery, Opinion opinion) {
        this.order = order;
        this.payment = payment;
        this.delivery = delivery;
        this.opinion = opinion;
    }

    public Order getOrder() {
        return order;
    }

    public Payment getPayment() {
        return payment;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public Opinion getOpinion() {
        return opinion;
    }
}
