package com.kodilla.good.patterns.challenge.flights;

public class Main {
    public static void main(String[] args) {
        String departureAirport = "Rio";
        String arrivalAirport = "Radom";
        String transeferAirport = "Obice";

        Flight flight = new Flight(departureAirport,arrivalAirport);
        FlightSearchService flightSearchService = new FlightSearchService();
        AvailableAirports availableAirports = new AvailableAirports();

        flightSearchService.findFlightFromAirport(departureAirport, availableAirports.getAvailableAirports());
        flightSearchService.findFlightToAirport(arrivalAirport,availableAirports.getAvailableAirports());
        flightSearchService.findFlightWithTransferIn(transeferAirport,availableAirports.getAvailableAirports());
    }
}
