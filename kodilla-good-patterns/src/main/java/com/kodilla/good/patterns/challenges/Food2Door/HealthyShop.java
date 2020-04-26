package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements FoodShop {
    private String name = "HealthyShop";
    @Override
    public boolean process() {
        System.out.println("Welcome to my HealthyShop!");

        return true;
    }

    public String getName() {
        return name;
    }
}
