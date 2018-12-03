package com.kodilla.good.patterns.challenges;

import java.util.*;

public class Opinion {
    private Order order;
    private List<String> opinions;

    public Opinion(Order order, List<String> opinions) {
        this.order = order;
        this.opinions = opinions;
    }

    public Order getOrder() {
        return order;
    }

    public List<String> getOpinions() {
        return opinions;
    }
}
