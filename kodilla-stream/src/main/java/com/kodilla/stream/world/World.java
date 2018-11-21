package com.kodilla.stream.world;

import java.math.*;
import java.util.*;

public class World {

        private final List<Continent> world = new ArrayList<>();

        public void addContinent(Continent continent){
            world.add(continent);
        }

         public boolean removeItem(Continent continent) {
            return world.remove(continent);
    }

        public BigDecimal getWorldPopulation() {
            return world.stream()
                .flatMap(c->c.getContinent().stream())
                .map(c->c.getPeopleQuantity())
                .reduce(BigDecimal.ZERO,(val, current) -> val = val.add(current));
    }
}

