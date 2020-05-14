package com.kodilla.good.patterns.challenge.flights;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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

    public void findFlightWithTransferIn(String arrivalAirport, Map<Integer,Flight> mapOfAvailableAirports, String departureAirport){

        Set<Flight> arrivalAirportsSet = mapOfAvailableAirports.entrySet().stream()
                .filter(s->s.getValue().getArrivalAirport().equals(arrivalAirport))
                .map(s->s.getValue())
                .collect(Collectors.toSet());

        Set<Flight> departureAirportsSet = mapOfAvailableAirports.entrySet().stream()
                .filter(s->s.getValue().getArrivalAirport().equals(departureAirport))
                .map(s->s.getValue())
                .collect(Collectors.toSet());

        for(Flight flight1: arrivalAirportsSet){
            for(Flight flight2: departureAirportsSet){
                if(flight1.getArrivalAirport().equals(flight2.getDepartureAirport())){
                    System.out.println(flight1);
                    System.out.println(flight2);
                }
            }
        }

    }
}
