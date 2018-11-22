package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.*;


public class WorldPopulationTesting {

    @Test
    public void testingPopulationCount() {
        Country polska = new Country("Polska", new BigDecimal("36000000"));
        Country niemcy = new Country("Niemcy", new BigDecimal("92000000"));
        Country hiszpania = new Country("Czechy", new BigDecimal("46000000"));
        Country francja = new Country("Francja", new BigDecimal("57000000"));
        Country rosja = new Country("Rumunia", new BigDecimal("149000000"));
        Country uk = new Country("Wielka Brytania", new BigDecimal("65000000"));

        Continent europe = new Continent();
            europe.countryAdd(polska);
            europe.countryAdd(niemcy);
            europe.countryAdd(hiszpania);
            europe.countryAdd(francja);
            europe.countryAdd(rosja);
            europe.countryAdd(uk);

        Country chiny = new Country("Chiny", new BigDecimal("1136000000"));
        Country indie = new Country("Indie", new BigDecimal("1222000000"));
        Country indonezja = new Country("Indonezja", new BigDecimal("251000000"));
        Country pakistan = new Country("Pakistan", new BigDecimal("157000000"));
        Country turcja = new Country("Turcja", new BigDecimal("88000000"));

        Continent asia = new Continent();
            asia.countryAdd(chiny);
            asia.countryAdd(indie);
            asia.countryAdd(indonezja);
            asia.countryAdd(pakistan);
            asia.countryAdd(turcja);

        Country usa = new Country("Usa", new BigDecimal("360000000"));
        Country kanada = new Country("Kanada", new BigDecimal("12000000"));
        Country meksyk = new Country("Meksyk", new BigDecimal("122000000"));

        Continent america = new Continent();
            america.countryAdd(usa);
            america.countryAdd(kanada);
            america.countryAdd(meksyk);

        World world = new World();
            world.addContinent(europe);
            world.addContinent(asia);
            world.addContinent(america);
        BigDecimal worldPopulation = world.getWorldPopulation();


        Assert.assertEquals(new BigDecimal("3793000000"),worldPopulation);
    }


}
