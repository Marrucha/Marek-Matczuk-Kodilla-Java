package com.kodilla.good.patterns.aviationCompany;

import java.util.*;

public class Flight {
    private int flightId;
    private String departure;
    private String arrival;

    public Flight(int flightId, String departure, String arrival) {
        this.flightId = flightId;
        this.departure = departure;
        this.arrival = arrival;
    }

    public int getFlightId() {
        return flightId;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return getFlightId() == flight.getFlightId() &&
                Objects.equals(getDeparture(), flight.getDeparture()) &&
                Objects.equals(getArrival(), flight.getArrival());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlightId(), getDeparture(), getArrival());
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId=" + flightId +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }
}
