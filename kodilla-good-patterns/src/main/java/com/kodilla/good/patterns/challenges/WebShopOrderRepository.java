package com.kodilla.good.patterns.challenges;

public class WebShopOrderRepository implements OrderRepository{

    @Override
    public void orderRepository(Order order, boolean paid) {
        System.out.println("Transakcja została dodana do bazy danych");

    }
}
