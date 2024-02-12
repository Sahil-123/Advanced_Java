package com.xworkz.JDBC.DTO;
public class FlightBooking {
    private int id;
    private String flightName;
    private String source;
    private String destination;
    private double ticketPrice;

    @Override
    public String toString() {
        return "FlightBooking{" +
                ", flightName='" + flightName + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", ticketPrice=" + ticketPrice +
                '}';
    }


    public FlightBooking() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public FlightBooking(String flightName, String source, String destination, double ticketPrice) {
        this.flightName = flightName;
        this.source = source;
        this.destination = destination;
        this.ticketPrice = ticketPrice;
    }
}
