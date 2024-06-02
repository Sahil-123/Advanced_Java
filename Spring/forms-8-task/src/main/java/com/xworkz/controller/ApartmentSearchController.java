package com.xworkz.controller;

import com.xworkz.dto.ApartmentSearchDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/apartment")
public class ApartmentSearchController {
    @PostMapping("/search")
    public String submitApartmentSearch(@Valid @ModelAttribute("dto") ApartmentSearchDTO apartmentSearchDTO,
                                        BindingResult bindingResult, Model model) {
        System.out.println(apartmentSearchDTO);
        model.addAttribute("dto", apartmentSearchDTO);
        model.addAttribute("msg", "Apartment search data submission is successful");

        if (bindingResult.hasErrors()) {
            System.out.println("Found error");
            bindingResult.getAllErrors().forEach(System.out::println);
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "pages/ApartmentSearch";
        }

        return "pages/Success";
    }
}
