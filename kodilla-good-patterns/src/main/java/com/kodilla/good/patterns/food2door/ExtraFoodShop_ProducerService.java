package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop_ProducerService implements ProducerService {

    @Override
    public boolean process(Order order) {
        if(order.getSupplier().isContract() && order.getQuantity() >= 100 && order.getOrderTime().getHour()<8 && order.getArticle().getArticleType().equals("Vegetables"))
        return true;
        else
        return false;
    }
}
