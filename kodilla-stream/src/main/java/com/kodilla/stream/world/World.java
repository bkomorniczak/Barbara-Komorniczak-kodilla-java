package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Set;

public class World {
    private final Set <Continent> continents;
    public World(final Set<Continent> continents){
        this.continents = continents;
    }



    public BigDecimal getPeopleQuantity(){
        BigDecimal worldPeopleQuantity = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,current) -> sum = sum.add(current));

        return worldPeopleQuantity;
    }
}
