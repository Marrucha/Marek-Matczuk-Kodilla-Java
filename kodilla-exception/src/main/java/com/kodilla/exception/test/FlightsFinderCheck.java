package com.kodilla.exception.test;

public class FlightsFinderCheck {
    public static void main(String [] args){
        FlightFinder ff = new FlightFinder();
        Flight a = new Flight("Warszawa", "Berlin");
        ff.mapFiller();
        try {
            if(ff.findFlight(a)){
                System.out.println("Airport is accesible");
            }
            else {
                System.out.println("You cant fly to this airport");
            }
        } catch (RouteNotFoundException e){
            System.out.println("EXCEPTION !!!!! Route not present on map");
        }





    }
}
