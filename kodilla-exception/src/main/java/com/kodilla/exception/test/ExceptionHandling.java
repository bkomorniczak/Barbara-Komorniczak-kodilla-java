package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {


        SecondChallenge secondChallenge = new SecondChallenge();
        double x = 0.;
        double y = 0.;

try{
    secondChallenge.probablyIWillThrowException(x,y);
}catch(Exception e){
            System.out.println("Wrong input! " + e);
        }
    }
}
