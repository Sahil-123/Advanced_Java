package com.xworkz.controller;

import com.xworkz.dto.ProjectAssignmentDTO;
import com.xworkz.dto.SetTopBoxRegistrationDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/task")
public class Form8Controller {


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

            return "pages/SetOfBoxServiceRegistery"; // redirect to success page
        }

        return "index"; // redirect to success page
    }

    @PostMapping("/projectAssignment")
    public String assignProject(@Valid ProjectAssignmentDTO projectAssignmentDTO, BindingResult bindingResult, Model model){

        System.out.println(projectAssignmentDTO);
        model.addAttribute("dto",projectAssignmentDTO);
        model.addAttribute("msg",
                "Project Assignment is successfull"
                );

        if (bindingResult.hasErrors()) {
            System.out.println("found error");
            bindingResult.getAllErrors().forEach(System.out::println);
            model.addAttribute("errors",bindingResult.getAllErrors());
            return "pages/ProjectManagement";

        }

        return "pages/Success";
    }

}
