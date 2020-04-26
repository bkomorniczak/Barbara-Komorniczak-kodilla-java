package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {

    public static void main(String[] args) {
        Product product = new Product("Sunflower", 1);
        Product product1 = new Product("carrot", 2);
        Product product2 = new Product("pen", 3);

        Item item = new Item(product, 3);
        Item item1 = new Item(product1, 4);
        Item item2 = new Item(product2, 9);
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.process(new ExtraFoodShop(), item);
        orderProcessor.process(new HealthyShop(), item1);
        orderProcessor.process(new GlutenFreeShop(), item2);
    }
}
