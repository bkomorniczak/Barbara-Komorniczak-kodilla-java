package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers){

        numbers.removeIf(i->i%2!=0);

        return numbers;
    }
}
