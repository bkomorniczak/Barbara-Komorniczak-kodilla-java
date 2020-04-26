package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements FoodShop{

    private String name;
    @Override
    public boolean process() {
        System.out.println("ExtraFoodShop extra welcome you!");

        return true;
    }

    public String getName() {
        return name;
    }
}
