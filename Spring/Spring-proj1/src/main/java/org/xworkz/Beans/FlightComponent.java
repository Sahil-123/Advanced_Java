package org.xworkz.Beans;


import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class FlightComponent {
    public FlightComponent(){
        System.out.println("Running FlightComponent....");
    }
}
