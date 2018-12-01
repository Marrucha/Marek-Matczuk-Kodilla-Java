package com.kodilla.exception.test;

public class RouteNotAvailable extends Exception {
    public String errorDesc(){
        return "Airport is not accesible now. Try later";
    }

}
