package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private OrderService orderService;
    private DeliveryService deliveryService;
    private OrderRepository orderRepository;
    private OpinionsService opinionsService;

    public OrderProcessor(final OrderService orderService,
                          final DeliveryService deliveryService,
                          final OrderRepository orderRepository,
                          final OpinionsService opinionsService
        ) {
        this.orderService = orderService;
        this.deliveryService = deliveryService;
        this.orderRepository = orderRepository;
        this.opinionsService = opinionsService;
    }

    public OrderDto process(final OrderRequest orderRequest) {

        boolean isPayed = orderRequest.getPayment().isPaymentDone();
        boolean isDelivered = orderRequest.getDelivery().isDeliveryStatus();

        if(isPayed && isDelivered) {
            orderRepository.orderRepository(orderRequest.getOrder(),true);
            return new OrderDto(orderRequest.getOrder(),orderRequest.getPayment(),orderRequest.getDelivery(),orderRequest.getOpinion(),true);
            } else {
            return new OrderDto(orderRequest.getOrder(),orderRequest.getPayment(),orderRequest.getDelivery(),orderRequest.getOpinion(),false);
            }
    }



}
