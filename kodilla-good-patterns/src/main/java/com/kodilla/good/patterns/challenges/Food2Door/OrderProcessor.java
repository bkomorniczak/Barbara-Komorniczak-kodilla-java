package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderProcessor {

    public void process(FoodShop foodShop, Item item){
        boolean isOrdered = foodShop.process(item);

        if(isOrdered){
            System.out.println("Thank you for choosing us. Your order: " + item.getAmount() + " of " + item.getProduct());

        }else {
            System.out.println("Something went wrong. Please contact " + foodShop.getName());
        }
    }
}
