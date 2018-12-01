package com.kodilla.exception.test;

import java.util.*;

public class FlightFinder  {
    private Map <String,Boolean> flightConnections = new HashMap<String,Boolean>();

    public boolean findFlight (Flight flight) throws RouteNotFoundException {
           if(!flightConnections.get(flight.getArrivalAirport()))
            throw new RouteNotFoundException();
           else
            return flightConnections.get(flight.getArrivalAirport());

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