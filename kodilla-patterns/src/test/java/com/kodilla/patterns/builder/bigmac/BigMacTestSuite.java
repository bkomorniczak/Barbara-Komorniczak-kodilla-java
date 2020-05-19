package com.kodilla.patterns.builder.bigmac;


import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMacBuilder(){
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("Broche")
                .burgers(1)
                .sauce("BigMac secret sauce")
                .ingredient("Salad")
                .ingredient("Pickles")
                .ingredient("Cheese")
                .build();
        //When
        String resultBun = bigMac.getBun();
        int resultBurgers = bigMac.getBurgers();
        String resultSauce = bigMac.getSauce();
        String resultIngredient1 = bigMac.getIngredients().get(0);
        String resultIngredient2 = bigMac.getIngredients().get(1);
        String resultIngredient3 = bigMac.getIngredients().get(2);
        //Then
        Assert.assertEquals("Broche", resultBun);
        Assert.assertEquals(1,resultBurgers);
        Assert.assertEquals("BigMac secret sauce",resultSauce);
        Assert.assertEquals("Salad", resultIngredient1);
        Assert.assertEquals("Pickles", resultIngredient2);
        Assert.assertEquals("Cheese", resultIngredient3);


    }
}
