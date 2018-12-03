package com.kodilla.good.patterns.food2door;

public class HealthyShop_ProducerService implements ProducerService{

    @Override
    public boolean process(Order order) {
        if(order.getSupplier().isContract() && order.getArticle().getArticleType().equals("BioSpices") && order.getQuantity()< 10000)
        return true;
        else
        return false;
    }
}
