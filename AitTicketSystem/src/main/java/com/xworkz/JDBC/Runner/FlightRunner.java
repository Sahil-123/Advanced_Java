package com.xworkz.JDBC.Runner;

import com.xworkz.JDBC.DTO.FlightBooking;
import com.xworkz.JDBC.Service.FlightBookingService;
import com.xworkz.JDBC.Service.FlightBookingServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class FlightRunner {
    public static void main(String[] args) {

        FlightBooking flightBooking = new FlightBooking("AirAsia","Mumbai","Bali", 45000);

        FlightBookingService flightBookingService = new FlightBookingServiceImpl();
        flightBookingService.save(flightBooking);

        List<FlightBooking> flightBookings = new ArrayList<>();
        FlightBooking flightBooking1 = new FlightBooking("AirAsia","Bangalore","Delhi",10000);
        FlightBooking flightBooking2 = new FlightBooking("Indigo", "Bangalore", "Chennai", 7000);
        flightBookings.add(flightBooking1);
        flightBookings.add(flightBooking2);
        flightBookingService.saveAll(flightBookings);

        flightBookingService.update("AirIndia", "Bangalore","Assam");
        flightBookingService.delete("Indigo");
        flightBooking = flightBookingService.findByName("Indigo");

        if(flightBooking == null){
            System.out.println("There are no flight");
        }else{
            System.out.println(flightBooking);

        }

        List<FlightBooking> flightBookingList = flightBookingService.findAll();
        flightBookingList.forEach((booking)->{
            System.out.println("------Flight Details--------");
            System.out.println(booking);
        });

    }
}
