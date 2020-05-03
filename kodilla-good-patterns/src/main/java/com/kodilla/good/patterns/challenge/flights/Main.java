package com.kodilla.good.patterns.challenge.flights;

public class Main {
    public static void main(String[] args) {
        String departureAirport = "Rio";
        String arrivalAirport = "Radom";

        Flight flight = new Flight(departureAirport,arrivalAirport);
        FlightSearchService flightSearchService = new FlightSearchService();
        AvailableAirports availableAirports = new AvailableAirports();

        flightSearchService.findFlightFromAirport(departureAirport, availableAirports.getAvailableAirports());
        flightSearchService.findFlightToAirport(arrivalAirport,availableAirports.getAvailableAirports());
        flightSearchService.findFlightWithTransferIn(flight,availableAirports.getAvailableAirports());
    }
}
