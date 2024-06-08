package com.xworkz.controller;

import com.xworkz.dto.SetTopBoxRegistrationDTO;
import com.xworkz.requestDto.RequestSetTopBoxRegistrationDTO;
import com.xworkz.service.SetOfBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping("/setOfBox")
public class SetOfBoxController {

    @Autowired
    private SetOfBoxService setOfBoxService;

    @PostMapping("/registerSetTopBox")
    public String registerComplaint(
            @Valid RequestSetTopBoxRegistrationDTO requestSetTopBoxRegistrationDTO,
            BindingResult bindingResult,
            Model model) {

        System.out.println(requestSetTopBoxRegistrationDTO);
        model.addAttribute("dto",requestSetTopBoxRegistrationDTO);
        model.addAttribute("msg","Setup Box registration is Successful");
        if (bindingResult.hasErrors()) {
            System.out.println("found error");
            bindingResult.getAllErrors().forEach(System.out::println);
            model.addAttribute("errors",bindingResult.getAllErrors());

            return "pages/SetOfBoxServiceRegistery"; // redirect to success page
        }else if (!setOfBoxService.save(requestSetTopBoxRegistrationDTO)) {
            model.addAttribute("errorMsg", "Something goes wrong registration not successful.");
            return "pages/SetOfBoxServiceRegistery";
        }

        return "pages/Success"; // redirect to success page
    }
}
