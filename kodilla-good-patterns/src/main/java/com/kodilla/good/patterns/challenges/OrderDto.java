package com.kodilla.good.patterns.challenges;

public class OrderDto {
    User user;
    boolean isFinalized;

    public OrderDto(User user, boolean isFinalized) {
        this.user = user;
        this.isFinalized = isFinalized;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "user=" + user +
                ", isFinalized=" + isFinalized +
                '}';
    }
}
