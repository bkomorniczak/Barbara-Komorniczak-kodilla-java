package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private String name;
    private BigDecimal peopleQuantity;

    public Country(final String name, final BigDecimal peopleQuantity) {
        this.name = name;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }
}
