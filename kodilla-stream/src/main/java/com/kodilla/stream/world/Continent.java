package com.kodilla.stream.world;

import java.util.*;

public final class Continent {
    private final List<Country> continent = new ArrayList<Country>();

    public void countryAdd(Country country){
        continent.add(country);
    }
    public List<Country> getContinent (){
            return continent;
    }

}
