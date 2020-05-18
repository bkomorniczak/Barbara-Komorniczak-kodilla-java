package com.kodilla.spring;

import com.kodilla.spring.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(4,3);
        double subResult = calculator.sub(10,2);
        double mulResult = calculator.mul(3,4);
        double divResult = calculator.div(12,4);
        double divNanResult = calculator.div(12,0);
        //Then
        Assert.assertEquals(7, addResult,0);
        Assert.assertEquals(8,subResult,0);
        Assert.assertEquals(12, mulResult,0);
        Assert.assertEquals(3, divResult,0);
        Assert.assertEquals(Double.NaN, divNanResult,0);
    }


}
