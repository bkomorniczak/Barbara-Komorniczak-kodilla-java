package com.kodilla.good.patterns.challenges;

public interface OrderRepository {
    Order createOrder(User user, String orderInfo);
}
