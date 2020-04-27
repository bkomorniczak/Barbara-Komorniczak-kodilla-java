package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements FoodShop {
    private String name = " GlutenFreeShop";

    @Override
    public boolean process(Item item) {
        System.out.println("GlutenFreeShop welcomes you!");
        return true;
    }

    public String getName() {
        return name;
    }
}
