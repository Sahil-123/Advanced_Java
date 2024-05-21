package org.xworkz.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.xworkz.Beans.AppointmentComponent;
import org.xworkz.Beans.Coffee;
import org.xworkz.configuration.DBProperties;


@Component
public class TempleService {

    @Autowired
    private AppointmentComponent appointmentComponent;

    @Autowired
    @Qualifier("name")
    private String fullname;

    @Autowired
    private Coffee coffee;

    @Autowired
    private DBProperties dbProperties;

    public TempleService(){
        System.out.println("temple service is created....");
//        System.out.println(dbProperties.getUsername());
//        System.out.println("in temple service"+dbProperties.getUsername());
    }

    /*
        @Autowired: follow 2 conditions.
         1) datatype: then pass reference of the object. if the datatype matches.
         2) if property name(variable name) matches then it passes the object reference.

        @Qualifier:
            it references the property name of the bean which we specify in.
            it checks the that property name and returns the that particular object reference.

     */


}
