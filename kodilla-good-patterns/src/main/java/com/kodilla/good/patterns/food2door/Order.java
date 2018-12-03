package com.kodilla.good.patterns.food2door;

import java.time.*;

public class Order {
    private Supplier supplier;
    private Article article;
    private int quantity;
    private LocalTime orderTime;

    public Order(Supplier supplier, Article article, int quantity, LocalTime orderTime) {
        this.supplier = supplier;
        this.article = article;
        this.quantity = quantity;
        this.orderTime = orderTime;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Article getArticle() {
        return article;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalTime getOrderTime() {
        return orderTime;
    }
}
