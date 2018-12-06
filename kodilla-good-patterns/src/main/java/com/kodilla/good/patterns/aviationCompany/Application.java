package com.kodilla.good.patterns.aviationCompany;

import java.util.*;

public class Application {
    public static void main (String args[]){
        String from = "Warszawa";
        String to = "Las Palmas";
        List flights = FlightRetriever.flightsList();

        FlightsService flightsService = new FlightsService();

        System.out.println("Flights from Warszawa");
        flightsService.flightsFrom(flights,from);

        System.out.println("\n" + "Flights to Las Palmas");
        flightsService.flightsTo(flights,to);

        System.out.println("\n" + "Flights from Warszawa to Las Palmas with 1 stop");
        flightsService.flightsRoutes(flights,from,to);

        System.out.println("\n" + "Flights from Warszawa to Las Palmas direct");
        flightsService.flightsDirect(flights,from,to);



    }
}
