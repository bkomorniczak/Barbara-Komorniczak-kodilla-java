package com.kodilla.good.patterns.challenges;

import java.util.List;

public class Order {
    private int id;
    private String productName;

    private User user;
    private int amount;

    public Order(int id, String productName, User user, int amount) {
        this.id = id;
        this.productName = productName;
        this.user = user;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public int getAmount() {
        return amount;
    }

    public User getUser() {
        return user;
    }
}
