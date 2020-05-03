package com.kodilla.good.patterns.challenge.flights;

import java.util.Map;

public class FlightSearchService {
    public void findFlightFromAirport(String departureAirport, Map<Integer,Flight> mapOfAvailableAirports){
        System.out.println("From: " + departureAirport);
        mapOfAvailableAirports.entrySet().stream()
                .filter(entry -> entry.getValue().getDepartureAirport().equals(departureAirport))
                .forEach(System.out::println);
    }

    public void findFlightToAirport(String arrivalAirport, Map<Integer, Flight> mapOfAvailableAirports){
        System.out.println("To: " + arrivalAirport);
        mapOfAvailableAirports.entrySet().stream()
                .filter(entry -> entry.getValue().getArrivalAirport().equals(arrivalAirport))
                .forEach(System.out::println);
    }

    public void findFlightWithTransferIn(Flight flight, Map<Integer,Flight> mapOfAvailableAirports){

        System.out.println("With transfer in: " + flight.getIntermediateAirport());

        mapOfAvailableAirports.entrySet().stream()
                .filter(entry->entry.getValue().equals(flight))
                .forEach(System.out::println);
    }
}
