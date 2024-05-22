package com.xworkz.service;

import com.xworkz.dto.Customer;
import com.xworkz.dto.CustomerLogin;
import com.xworkz.respository.*;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Slf4j
public class RegisterServiceImpl implements RegisterService{
    @Override
    public void register(HttpServletRequest request, HttpServletResponse response) throws IOException {
        log.error("Customer data is being process.....");

        Customer customer = getCutomerDTOFromRequest(request);
        CustomerLogin customerLogin = getCutomerLoginDTOFromRequest(request);

        CustomerRegistrationRepository registrationRepository=new CustomerRegistrationRepositoryImpl();
        registrationRepository.register(customer,customerLogin);

        response.getWriter().println("Customer Data saved successfully");
    }

    private Customer getCutomerDTOFromRequest(HttpServletRequest request){
        Customer customer=new Customer();
        customer.setName(request.getParameter("name"));
        customer.setAge(Integer.valueOf(request.getParameter("age")));
        customer.setGender(request.getParameter("gender"));
        customer.setDob( LocalDate.parse(request.getParameter("dob"), DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
        customer.setAddress(request.getParameter("address"));
        customer.setPhone(request.getParameter("phone"));
        customer.setAdhar(request.getParameter("adhar"));
        customer.setEmergencyContact(request.getParameter("emergencyContact"));

        return customer;
    }

    private CustomerLogin getCutomerLoginDTOFromRequest(HttpServletRequest request){
        CustomerLogin customerLogin=new CustomerLogin();
        customerLogin.setUsername(request.getParameter("username"));
        customerLogin.setPassword(request.getParameter("password"));

        return customerLogin;
    }
}
