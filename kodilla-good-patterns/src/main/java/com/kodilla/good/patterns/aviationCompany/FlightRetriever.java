package com.kodilla.good.patterns.aviationCompany;

import java.util.*;

public class FlightRetriever {
    public static List<Flight> flightsList (){
        List<Flight> flights = new ArrayList<Flight>();
        flights.add(new Flight(1,"Warszawa","Berlin"));
        flights.add(new Flight(2,"Berlin","Las Palmas"));
        flights.add(new Flight(3,"Warszawa","Madryt"));
        flights.add(new Flight(4,"Madryt","Las Palmas"));
        flights.add(new Flight(5,"Berlin","Madryt"));
        flights.add(new Flight(6,"Warszawa","Londyn"));
        flights.add(new Flight(7,"Londyn","Madryt"));
        flights.add(new Flight(8,"Londyn","Las Palmas"));
        flights.add(new Flight(9,"Warszawa","Barcelona"));
        flights.add(new Flight(10,"Barcelona ","Londyn"));
        flights.add(new Flight(11,"Warszawa","Wiedeń"));
        flights.add(new Flight(12,"Wiedeń","Berlin"));
        return flights;

    }
}
