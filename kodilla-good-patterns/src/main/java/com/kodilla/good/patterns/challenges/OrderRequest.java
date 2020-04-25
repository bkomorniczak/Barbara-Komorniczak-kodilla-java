package com.kodilla.good.patterns.challenges;

import java.util.List;

public class OrderRequest {
    private User user;

    private List<Item> items;

    public OrderRequest(User user, List<Item> items) {
        this.user = user;
        this.items = items;
    }

    public User getUser() {
        return user;
    }

    public String getOrderInfo(){

        String orderInfo = user.getName() + " " + "id:" +" " + user.getId() +  " " + "ordered: " ;
        System.out.println(orderInfo);
        items.stream()
                .forEach(System.out::println);

        return orderInfo;
    }


}
