package com.kodilla.testing.forum;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: Start -OddNumbersExtermination");
    }
    @After
    public void after(){
        System.out.println("Test Case: End -OddNumbersExtermination");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList <>();
        //When
       List nulllist = OddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(nulllist.isEmpty(), true);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        List<Integer> numbers = new ArrayList <>();
        //When
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        ArrayList<Integer> evenList = new ArrayList<>();
        evenList.add(2);
        evenList.add(4);
        evenList.add(6);
        evenList.add(8);
        evenList.add(10);

        List<Integer> exterminatedList = OddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(numbers,evenList);
    }


}
