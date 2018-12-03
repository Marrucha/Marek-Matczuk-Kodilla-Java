package com.kodilla.good.patterns.challenges;

import java.util.stream.*;

public class WebShopOpinionService implements OpinionsService {
    @Override
    public void processOpinions(Order order, Opinion opinion) {
        String listOpinions = opinion.getOpinions().stream()
                .collect(Collectors.joining("/n"));
        System.out.println("Opinions " + listOpinions );
    }
}
