package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public static List<Integer> exterminate(List<Integer> numbers){

        numbers.removeIf(i->i%2!=0);

        return numbers;
    }
}
