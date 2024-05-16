package org.xworkz.Beans;

import org.springframework.stereotype.Component;

@Component
public class AppointmentComponent {
    public AppointmentComponent(){
        System.out.println("Running AppointmentComponent....");
    }

    public void getCheck(){
        System.out.println("checking the Appointment...");
    }
}
