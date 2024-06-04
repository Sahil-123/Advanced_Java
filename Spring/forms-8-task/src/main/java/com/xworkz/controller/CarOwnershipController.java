package com.xworkz.controller;

import com.xworkz.dto.CarOwnershipDTO;
import com.xworkz.service.CarOwnershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping("/carOwnership")
public class CarOwnershipController {

    @Autowired
    private CarOwnershipService carOwnershipService;

    @PostMapping("/update")
    public String updateCarOwnership(@Valid CarOwnershipDTO carOwnershipDTO, BindingResult bindingResult, Model model) {
        System.out.println(carOwnershipDTO);
        model.addAttribute("dto", carOwnershipDTO);
        model.addAttribute("msg", "Car ownership information updated successfully");

        if (bindingResult.hasErrors()) {
            System.out.println("Found error");
            bindingResult.getAllErrors().forEach(System.out::println);
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "pages/UpdateCarOwnershipInfo";
        }else if (!carOwnershipService.update(carOwnershipDTO)) {
            model.addAttribute("errorMsg", "Something goes wrong update not successful.");
            return "pages/UpdateCarOwnershipInfo";
        }

        return "pages/Success";
    }

}
