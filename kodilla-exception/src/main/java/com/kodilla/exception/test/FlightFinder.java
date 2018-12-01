package com.kodilla.exception.test;

import java.util.*;

public class FlightFinder  {
    private Map <String,Boolean> flightConnections = new HashMap<String,Boolean>();

    public boolean findFlight (Flight flight) throws RouteNotFoundException {
        try {
           return flightConnections.get(flight.getArrivalAirport());
        } catch (Exception e) {
            throw new RouteNotFoundException();
        }
    }

    public void mapFiller() {
        flightConnections.put("Warszawa",true);
        flightConnections.put("Kraków",true);
        flightConnections.put("Gdańsk",true);
        flightConnections.put("Lublin",true);
        flightConnections.put("Olsztyn",true);
        flightConnections.put("Wrocław",true);
        flightConnections.put("Katowice",false);
        flightConnections.put("Poznań",true);
    }
}