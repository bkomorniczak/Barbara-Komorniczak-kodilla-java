package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {

        Flight flight = new Flight("Budapeszt", "Warszawa");
        Flight flight1 = new Flight("Kraków", "Kielce");
        Flight flight2 = new Flight("Budapeszt", "Kolonia");

        FlightFinder flightFinder = new FlightFinder();
        try{
            flightFinder.findFlight(flight);
        }catch(RouteNotFoundException e){
            System.out.println("Airport is not available.");
        }
        try{
            flightFinder.findFlight(flight1);
        }catch(RouteNotFoundException e){
            System.out.println("Airport is not available.");
        }
        try{
            flightFinder.findFlight(flight2);
        }catch(RouteNotFoundException e){
            System.out.println("Airport is not available.");
        }
    }
}
