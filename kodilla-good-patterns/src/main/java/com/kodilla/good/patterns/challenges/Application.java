package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String [] args) {
        OrderRequestRetriever orr = new OrderRequestRetriever();
        OrderRequest orderRequest = orr.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new WebShopOrderService(),
                new WebShopDeliveryService(),
                new WebShopOrderRepository(),
                new WebShopOpinionService());
        orderProcessor.process(orderRequest);



    }

}
