package org.xworkz.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xworkz.configuration.DBProperties;

@Controller
@RequestMapping("/")
public class MarriegeController {

    @Autowired
    private DBProperties dbProperties;

    public MarriegeController(){
        System.out.println("MarriegeController initiated....");
    }

    @PostMapping("/send")
    public String sendFile(){
        System.out.println("sendFile method is requested...");
        System.out.println("username : "+dbProperties.getUsername());
        return "ResponsePage.html";
    }
}
