package com.xworkz.controller;

import com.xworkz.dto.SetTopBoxRegistrationDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/register")
public class SetTopBoxRegistrationController {

    @PostMapping("/registerSetTopBox")
    public String registerComplaint(
        @Valid SetTopBoxRegistrationDTO registrationDTO,
        BindingResult bindingResult,
        Model model) {

        System.out.println(registrationDTO);
        model.addAttribute("dto",registrationDTO);

        if (bindingResult.hasErrors()) {
            System.out.println("found error");
            bindingResult.getAllErrors().forEach(System.out::println);
            model.addAttribute("errors",bindingResult.getAllErrors());

            return "SetOfBoxServiceRegistery"; // redirect to success page
        }

        return "index"; // redirect to success page
    }
}
