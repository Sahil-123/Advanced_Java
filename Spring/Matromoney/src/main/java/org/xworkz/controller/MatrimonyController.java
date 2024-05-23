package org.xworkz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xworkz.dto.ContactDTO;
import org.xworkz.dto.MatromonyRegisterDTO;

@Controller
@RequestMapping("/")
public class MatrimonyController {

    @PostMapping("/register")
    public String registerOnMatrimony(MatromonyRegisterDTO matromonyRegisterDTO, Model model){
        model.addAttribute("data",matromonyRegisterDTO);
        System.out.println("Matromony register process is initiated.");
        System.out.println(matromonyRegisterDTO);
        return "RegistrationSuccess.jsp";
    }

    @PostMapping("/contact")
    public String contactMatrimony(ContactDTO contactDTO,Model model){
        System.out.println("contact page is called.");
        System.out.println(contactDTO);
        model.addAttribute("msg","Thanks for contacting "+contactDTO.getName());
        return "Contact.jsp";
    }


}
