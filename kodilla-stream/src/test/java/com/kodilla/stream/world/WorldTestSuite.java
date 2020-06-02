/*
package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country country1 = new Country("Chiny", new BigDecimal("1"));
        Country country2 = new Country("Indie", new BigDecimal("1"));
        Country country3 = new Country("Turcja", new BigDecimal("1"));

        Country country4 = new Country("Turcja", new BigDecimal("1"));
        Country country5 = new Country("Niemcy", new BigDecimal("1"));
        Country country6 = new Country("Francja", new BigDecimal("1"));

        Country country7 = new Country("Egipt", new BigDecimal("1"));
        Country country8 = new Country("RPA", new BigDecimal("1"));
        Country country9 = new Country("Libia", new BigDecimal("1"));


        Set<Country> asianSet = new HashSet <>();
        asianSet.add(country1);
        asianSet.add(country2);
        asianSet.add(country3);

        Set<Country>europeanSet =  new HashSet <>();
        europeanSet.add(country4);
        europeanSet.add(country5);
        europeanSet.add(country6);

        Set<Country> africanSet = new  HashSet <>();
        africanSet.add(country7);
        africanSet.add(country8);
        africanSet.add(country9);

        Continent asia = new Continent(asianSet);
        Continent europe = new Continent(europeanSet);
        Continent africa = new Continent(africanSet);

        Set<Continent> worldSet = new HashSet <>();
        worldSet.add(asia);
        worldSet.add(europe);
        worldSet.add(africa);

        World world = new World(worldSet);
        BigDecimal allPeople = world.getPeopleQuantity();

        Assert.assertEquals(new BigDecimal("8"),allPeople);
    }


}
*/
