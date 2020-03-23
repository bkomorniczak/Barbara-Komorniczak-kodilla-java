package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {

        Flight flight = new Flight("Moskwa", "Nowy York");
        FlightFinder flightFinder = new FlightFinder();
        try{
            flightFinder.findFlight(flight);
        }catch(RouteNotFoundException e){
            System.out.println("Airport is not available.");
        }
    }
}
