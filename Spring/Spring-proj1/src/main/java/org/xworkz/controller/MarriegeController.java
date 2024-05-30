package org.xworkz.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xworkz.configuration.DBProperties;
import org.xworkz.dto.ComplaintRegisterDTO;
import org.xworkz.dto.MatromonyRegisterDTO;

import javax.validation.Valid;


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

    @PostMapping("/register")
    public String registerOnMatromony(MatromonyRegisterDTO matromonyRegisterDTO, Model model){
        model.addAttribute("data",matromonyRegisterDTO);
        System.out.println("Matromony register process is initiated.");
        System.out.println(matromonyRegisterDTO);
        return "Success.jsp";
    }

    @PostMapping("/registerComplaint")
    public String registerComplaint(@Valid ComplaintRegisterDTO complaintRegisterDTO, BindingResult bindingResult, Model model){

        System.out.println("here we go = "+bindingResult.hasErrors() +" "+bindingResult.getAllErrors());

        if(bindingResult.hasErrors()){
            System.out.println("found error"+bindingResult.hasErrors());
            bindingResult.getAllErrors().forEach(objectError-> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors",bindingResult.getAllErrors());
            return "CustomerComplaint.jsp";
        }else{
            model.addAttribute("data",complaintRegisterDTO);
            System.out.println("Complaint register process is initiated.");
            System.out.println(complaintRegisterDTO);
            return "ComplaintSuccess.jsp";
        }

    }

}
