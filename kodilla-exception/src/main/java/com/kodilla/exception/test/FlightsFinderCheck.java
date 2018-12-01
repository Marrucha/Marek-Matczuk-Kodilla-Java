package com.kodilla.exception.test;

import java.util.*;

public class FlightsFinderCheck {
    public static void main(String [] args){
        FlightFinder ff = new FlightFinder();
        Flight a = new Flight("Warszawa", "Katowice");
        Flight b = new Flight("Warszawa", "Berlin");
        Flight c = new Flight("Warszawa", "Gdańsk");
        ff.mapFiller();
        try { ff.findFlight(a);
              System.out.println("Airport is accesible");
        } catch (RouteNotFoundException e){
            System.out.println("EXCEPTION !!!!! " + e.errorDesc());
        } catch (RouteNotAvailable ee) {
            System.out.println("Exception !!!!" + ee.errorDesc());
        }





    }
}
