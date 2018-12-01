package com.kodilla.exception.test;

import java.util.*;

public class FlightsFinderCheck {
    public static void main(String [] args){
        FlightFinder ff = new FlightFinder();
        Flight a = new Flight("Warszawa", "Katowice");
        ff.mapFiller();
        try { ff.findFlight(a);
              System.out.println("Airport is accesible");
        } catch (RouteNotFoundException e){
            System.out.println("EXCEPTION !!!!! Route not available");
        }




    }
}
