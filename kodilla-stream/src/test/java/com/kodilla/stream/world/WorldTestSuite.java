package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

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


        List<Country>asianList = new ArrayList <>();
        asianList.add(country1);
        asianList.add(country2);
        asianList.add(country3);

        List<Country>europeanList = new ArrayList <>();
        europeanList.add(country4);
        europeanList.add(country5);
        europeanList.add(country6);

        List<Country>africanList = new ArrayList <>();
        africanList.add(country7);
        africanList.add(country8);
        africanList.add(country9);

        Continent asia = new Continent(asianList);
        Continent europe = new Continent(europeanList);
        Continent africa = new Continent(africanList);

        List<Continent> worldList = new ArrayList <>();
        worldList.add(asia);
        worldList.add(europe);
        worldList.add(africa);

        World world = new World(worldList);
        BigDecimal allPeople = world.getPeopleQuantity();

        Assert.assertEquals(new BigDecimal("8"),allPeople);
    }


}
