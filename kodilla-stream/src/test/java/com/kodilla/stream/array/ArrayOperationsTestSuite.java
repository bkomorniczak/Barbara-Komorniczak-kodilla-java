package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ArrayOperationsTestSuite {


    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = new int[20];
        int sum = 0;
        Random rand = new Random();

        for(int i =0;i<15;i++){
            numbers[i] = rand.nextInt(100);
            sum+=numbers[i];
        }
        double expected = (double) sum/numbers.length;

        //When
        double actual = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(expected,actual,0);

    }
}
