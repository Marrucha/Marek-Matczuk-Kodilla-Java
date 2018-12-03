package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private Order order;
    private Payment payment;
    private Delivery delivery;
    private Opinion opinion;
    private boolean transactionDone;

    public OrderDto(Order order, Payment payment, Delivery delivery, Opinion opinion, boolean transactionDone) {
        this.order = order;
        this.payment = payment;
        this.delivery = delivery;
        this.opinion = opinion;
        this.transactionDone = transactionDone;


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
