package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent>continents;
    public World(final List<Continent> continents){
        this.continents = continents;
    }



    public BigDecimal getPeopleQuantity(){
        BigDecimal worldPeoplesQuantity = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .filter(country -> !country.equals(this))
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,current) -> sum = sum.add(current));
        return worldPeoplesQuantity;
    }
}
