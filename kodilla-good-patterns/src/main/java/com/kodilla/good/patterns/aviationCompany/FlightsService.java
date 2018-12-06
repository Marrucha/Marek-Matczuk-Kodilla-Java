package com.kodilla.good.patterns.aviationCompany;

import java.util.*;

public class FlightsService {
    public void flightsFrom(List<Flight> flights, String from) {
        flights.stream()
                .filter(f -> f.getDeparture().equals(from))
                .map(m -> m.toString())
                .forEach(System.out::println);
    }

    public void flightsTo(List<Flight> flights, String to) {
        flights.stream()
                .filter(f -> f.getArrival().equals(to))
                .map(m -> m.toString())
                .forEach(System.out::println);
    }

    public void flightsDirect(List<Flight> flights, String from,String to) {
        flights.stream()
                .filter(f -> f.getArrival().equals(to))
                .filter(f -> f.getDeparture().equals(from))
                .map(m -> m.toString())
                .forEach(System.out::println);
    }

    public void flightsRoutes(List<Flight> flights, String from, String to) {
         for (int i = 0; i < flights.size(); i++) {
            for (int ii = 0; ii<flights.size(); ii++) {
                if(flights.get(i).getArrival().equals(to) &&
                    flights.get(ii).getDeparture().equals(from) &&
                    flights.get(i).getDeparture().equals(flights.get(ii).getArrival())) {
                     System.out.println("FROM:"+ flights.get(ii) + " TO: " + flights.get(i));
                }

            }
        }

    }
}


