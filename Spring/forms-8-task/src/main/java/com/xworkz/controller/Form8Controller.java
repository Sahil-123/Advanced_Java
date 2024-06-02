package com.xworkz.controller;

import com.xworkz.dto.*;
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

    @PostMapping("/carOwnership/update")
    public String updateCarOwnership(@Valid CarOwnershipDTO carOwnershipDTO, BindingResult bindingResult, Model model) {
        System.out.println(carOwnershipDTO);
        model.addAttribute("dto", carOwnershipDTO);
        model.addAttribute("msg", "Car ownership information updated successfully");

        if (bindingResult.hasErrors()) {
            System.out.println("Found error");
            bindingResult.getAllErrors().forEach(System.out::println);
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "pages/UpdateCarOwnershipInfo";
        }

        return "pages/Success";
    }

    @PostMapping("/submitFeedback")
    public String submitFeedback(@Valid FeedbackDTO feedbackDTO, BindingResult bindingResult, Model model) {
        System.out.println(feedbackDTO);
        model.addAttribute("dto", feedbackDTO);
        model.addAttribute("msg", "Feedback submission is successful");

        if (bindingResult.hasErrors()) {
            System.out.println("Found error");
            bindingResult.getAllErrors().forEach(System.out::println);
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "pages/FeedBackForm";
        }

        return "pages/Success";
    }

    @PostMapping("/submitServey")
    public String submitSurvey(@Valid SurveyFormDTO surveyFormDTO, BindingResult bindingResult, Model model) {
        System.out.println(surveyFormDTO);
        model.addAttribute("dto", surveyFormDTO);
        model.addAttribute("msg", "Survey submission is successful");

        if (bindingResult.hasErrors()) {
            System.out.println("Found error");
            bindingResult.getAllErrors().forEach(System.out::println);
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "pages/ServeyForm";
        }

        return "pages/Success";
    }

}
