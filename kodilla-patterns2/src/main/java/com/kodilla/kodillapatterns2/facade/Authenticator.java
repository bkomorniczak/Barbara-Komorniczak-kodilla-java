package com.kodilla.kodillapatterns2.facade;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Authenticator {
    public boolean isAuthenticated () {
        Random generator = new Random();
        return generator.nextBoolean();
    }
}