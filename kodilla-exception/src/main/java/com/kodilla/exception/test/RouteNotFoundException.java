package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {
        public String errorDesc(){
            return "Destination airport not found on list";
        }
}
