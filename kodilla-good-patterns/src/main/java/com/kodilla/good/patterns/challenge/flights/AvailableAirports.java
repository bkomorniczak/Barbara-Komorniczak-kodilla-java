package com.kodilla.good.patterns.challenge.flights;

import java.util.HashMap;
import java.util.Map;

public class AvailableAirports {
    public Map<Integer, Flight> getAvailableAirports(){
        Map<Integer, Flight> mapOfAvailableAirpoorts = new HashMap<>();
        mapOfAvailableAirpoorts.put(1, new Flight("Warsaw","Obice"));
        mapOfAvailableAirpoorts.put(2, new Flight("Rio","Berlin"));
        mapOfAvailableAirpoorts.put(3,new Flight("Radom","Warsaw"));
        mapOfAvailableAirpoorts.put(4, new Flight("Obice", "Rio"));
        mapOfAvailableAirpoorts.put(5, new Flight("Rio","Radom"));

        return mapOfAvailableAirpoorts;
    }
}
