package org.xworkz.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.xworkz.Beans.AppointmentComponent;
import org.xworkz.Beans.Coffee;


@Component
public class TempleService {

    @Autowired
    private AppointmentComponent appointmentComponent;

    @Autowired
    @Qualifier("name")
    private String fullname;

    @Autowired
    private Coffee coffee;

    /*
        @Autowired: follow 2 conditions.
         1) datatype: then pass reference of the object. if the datatype matches.
         2) if property name(variable name) matches then it passes the object reference.

        @Qualifier:
            it references the property name of the bean which we specify in.
            it checks the that property name and returns the that particular object reference.

     */


}
