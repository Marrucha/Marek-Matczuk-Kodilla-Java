package com.kodilla.good.patterns.challenges;

public class Order {
    private Article article;
    private User user;
    private int order_id;
    private double price;

    public Order(int order_id, Article article, User user, double price) {
        this.order_id = order_id;
        this.article = article;
        this.user = user;
        this.price = price;

    }

    public Article getArticle() {
        return article;
    }

    public User getUser() {
        return user;
    }

    public int getOrder_id() {
        return order_id;
    }

    public double getPrice(){
        return price;
    }
}
