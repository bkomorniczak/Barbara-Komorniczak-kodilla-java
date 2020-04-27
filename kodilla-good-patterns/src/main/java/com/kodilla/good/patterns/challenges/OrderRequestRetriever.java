package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {
    private List<Item> itemList = new ArrayList<>();
    public OrderRequest retrieve(){

        User user = new User(1,"Name");
        Product product1 = new Product("Toilet paper");
        Product product2 = new Product("Hand sanitizer");
        Item item1 = new Item(product1,4);
        Item item2 = new Item(product2, 500);
        itemList.add(item1);
        itemList.add(item2);

        return new OrderRequest(user,itemList);
    }
}
