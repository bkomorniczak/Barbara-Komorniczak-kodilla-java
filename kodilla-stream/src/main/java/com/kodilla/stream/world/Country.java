package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(name, country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
