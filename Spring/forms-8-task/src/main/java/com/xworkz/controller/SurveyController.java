package com.xworkz.controller;

import com.xworkz.dto.SurveyFormDTO;
import com.xworkz.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("survey")
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @PostMapping("/submitSurvey")
    public String submitSurvey(@Valid SurveyFormDTO surveyFormDTO, BindingResult bindingResult, Model model) {
        System.out.println(surveyFormDTO);
        model.addAttribute("dto", surveyFormDTO);
        model.addAttribute("msg", "Survey submission is successful");

        if (bindingResult.hasErrors()) {
            System.out.println("Found error");
            bindingResult.getAllErrors().forEach(System.out::println);
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "pages/ServeyForm";
        }else if (!surveyService.save(surveyFormDTO)) {
            model.addAttribute("errorMsg", "Something goes wrong survey submit not successful.");
            return "pages/ServeyForm";
        }

        return "pages/Success";
    }
}
