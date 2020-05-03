package com.kodilla.good.patterns.challenge.flights;

import java.util.Objects;


public class Flight {
    private String arrivalAirport;
    private String departureAirport;
    private String intermediateAirport;

    public Flight(String arrivalAirport, String departureAirport, String intermediateAirport) {
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
        this.intermediateAirport = intermediateAirport;
    }

    public Flight(String arrivalAirport, String departureAirport) {
        this(arrivalAirport, departureAirport,null);
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getIntermediateAirport() {


        return intermediateAirport;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return getArrivalAirport().equals(flight.getArrivalAirport()) &&
                getDepartureAirport().equals(flight.getDepartureAirport()) &&
                Objects.equals(getIntermediateAirport(), flight.getIntermediateAirport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getArrivalAirport(), getDepartureAirport(), getIntermediateAirport());
    }

    @Override
    public String toString() {
        return "Flight{" +
                "arrivalAirport='" + arrivalAirport + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", intermediateAirport='" + intermediateAirport + '\'' +
                '}';
    }
}
