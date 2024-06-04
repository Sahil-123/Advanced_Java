package com.xworkz.controller;

import com.xworkz.dto.FeedbackDTO;
import com.xworkz.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/feedback")
public class FeedBackController {

    @Autowired
    private FeedbackService feedbackService;

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
        }if (!feedbackService.save(feedbackDTO)) {
            model.addAttribute("errorMsg", "Something goes wrong submission not successful.");
            return "pages/FeedBackForm";
        }

        return "pages/Success";
    }
}
