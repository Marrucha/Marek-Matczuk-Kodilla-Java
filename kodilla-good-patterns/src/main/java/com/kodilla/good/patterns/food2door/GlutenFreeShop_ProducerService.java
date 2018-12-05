package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop_ProducerService implements ProducerService {
    @Override
    public boolean process(Order order) {
        return order.getSupplier().isContract() && order.getQuantity()>2 && order.getQuantity()<500 && order.getArticle().getArticleType().equals("Gluten Free");
     }
}
