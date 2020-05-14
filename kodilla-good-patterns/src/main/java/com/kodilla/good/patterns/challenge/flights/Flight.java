package com.kodilla.good.patterns.challenge.flights;

import java.util.Objects;


public class Flight {
    private String arrivalAirport;
    private String departureAirport;


    public Flight(String arrivalAirport, String departureAirport) {
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;

    }



    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return getArrivalAirport().equals(flight.getArrivalAirport()) &&
                getDepartureAirport().equals(flight.getDepartureAirport());

    }

    @Override
    public int hashCode() {
        return Objects.hash(getArrivalAirport(), getDepartureAirport());
    }

    @Override
    public String toString() {
        return "Flight{" +
                "arrivalAirport='" + arrivalAirport + '\'' +
                ", departureAirport='" + departureAirport;
    }
}
