package com.xworkz.controller;

import com.xworkz.dto.TravelReservationDTO;
import com.xworkz.service.TravelReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("travel")
public class TravelReservationController {

    @Autowired
    private TravelReservationService travelReservationService;

    @PostMapping("/submitTravelReservation")
    public String submitTravelReservation(@Valid @ModelAttribute("dto") TravelReservationDTO travelReservationDTO,
                                          BindingResult bindingResult, Model model) {

        System.out.println(travelReservationDTO);
        model.addAttribute("dto", travelReservationDTO);
        model.addAttribute("msg", "Travel Reservation is successful");

        if (bindingResult.hasErrors()) {
            System.out.println("Found error");
            bindingResult.getAllErrors().forEach(System.out::println);
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "pages/TravelReservationForm";
        }else if (!travelReservationService.reserve(travelReservationDTO)) {
            model.addAttribute("errorMsg", "Something goes wrong reservation not successful.");
            return "pages/TravelReservationForm";
        }

        return "pages/Success";

    }
}
