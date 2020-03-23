package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException{
        HashMap<String, Boolean> airporstsMap = new HashMap();
        airporstsMap.put("Barcelona", false);
        airporstsMap.put("Budapeszt", true);
        airporstsMap.put("Kolonia", false);
        airporstsMap.put("Warszawa",true);

        if(!airporstsMap.containsKey(flight.getDepartureAirport())){
            throw new RouteNotFoundException();
        }else{
            if(airporstsMap.get(flight.getArrivalAirport())){
                System.out.println("From: " + flight.getDepartureAirport() + " to: " + flight.getArrivalAirport() + " is available");
            }else {
                throw new RouteNotFoundException();
            }
        }
    }
}
