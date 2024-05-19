package com.xworkz.service;

import com.xworkz.dto.Customer;
import com.xworkz.dto.CustomerLogin;
import com.xworkz.respository.RegistrationRepository;
import com.xworkz.respository.RegistrationRepositoryImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Enumeration;

public class RegisterServiceImpl implements RegisterService{
    @Override
    public void register(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Customer customer = new Customer();
        customer.setName(request.getParameter("name"));
        customer.setAge(Integer.valueOf(request.getParameter("age")));
        customer.setGender(request.getParameter("gender"));
        customer.setDob( LocalDate.parse(request.getParameter("dob"), DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
        customer.setAddress(request.getParameter("address"));
        customer.setPhone(request.getParameter("phone").toCharArray());
        customer.setAdhar(request.getParameter("adhar").toCharArray());
        customer.setEmergencyContact(request.getParameter("emergencyContact").toCharArray());

        CustomerLogin customerLogin=new CustomerLogin();
        customerLogin.setUsername(request.getParameter("username"));
        customerLogin.setPassword(request.getParameter("password"));

        System.out.println(customer);
        System.out.println(customerLogin);

        RegistrationRepository registrationRepository=new RegistrationRepositoryImpl();
        registrationRepository.register(customer,customerLogin);

//        System.out.println(request.getParameter("name"));

        response.getWriter().println("Data saved successfully");
    }
}
