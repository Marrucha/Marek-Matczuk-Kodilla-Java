package com.kodilla.good.patterns.food2door;

public class OrdersProcessor {
    private ProducerService productService;

    public OrdersProcessor(final ProducerService productService) {
        this.productService = productService;
    }

    public boolean processOrder(Order order){
        return productService.process(order);
    }
}
