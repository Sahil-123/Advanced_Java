package com.xworkz.app;

import com.xworkz.dto.Customer;
import com.xworkz.dto.CustomerLogin;
import com.xworkz.respository.CustomerRegistrationRepository;
import com.xworkz.respository.CustomerRegistrationRepositoryImpl;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        CustomerRegistrationRepository registrationRepository=new CustomerRegistrationRepositoryImpl();

        Customer customer = new Customer();
        customer.setName("sahil");
        customer.setDob(LocalDate.now());
        customer.setAddress("sdfghjkl");
        customer.setPhone("123456829090");
        customer.setAge(24);
        customer.setGender("male");
        customer.setAdhar("123456882009");
        customer.setEmergencyContact("123458789009");

        CustomerLogin customerLogin=new CustomerLogin();
        customerLogin.setUsername("sahil");
        customerLogin.setPassword("sahil");

        registrationRepository.register(customer,customerLogin);

    }
}
