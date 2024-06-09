package com.xworkz.controller;

import com.xworkz.dto.SurveyFormDTO;
import com.xworkz.dto.TravelReservationDTO;
import com.xworkz.exception.InfoException;
import com.xworkz.requestDto.RequestTravelReservationDTO;
import com.xworkz.service.TravelReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("travel")
public class TravelReservationController {

    @Autowired
    private TravelReservationService travelReservationService;

    @PostMapping("/submitTravelReservation")
    public String submitTravelReservation(@Valid @ModelAttribute("dto") RequestTravelReservationDTO requestTravelReservationDTO,
                                          BindingResult bindingResult, Model model) {

        System.out.println(requestTravelReservationDTO);
        model.addAttribute("dto", requestTravelReservationDTO);
        model.addAttribute("msg", "Travel Reservation is successful");

        if (bindingResult.hasErrors()) {
            System.out.println("Found error");
            bindingResult.getAllErrors().forEach(System.out::println);
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "pages/TravelReservationForm";
        }else if (!travelReservationService.save(requestTravelReservationDTO)) {
            model.addAttribute("errorMsg", "Something goes wrong reservation not successful.");
            return "pages/TravelReservationForm";
        }

        return "pages/Success";
    }

    @GetMapping("/findId")
    public String findTravelReservationById(@RequestParam(required = false) Integer reservationId, Model model) {

        System.out.println("Find by the Id: " + reservationId);

        try {
            Optional<TravelReservationDTO> travelReservationDTO = travelReservationService.findById(reservationId);

            if (travelReservationDTO.isPresent()) {
                model.addAttribute("dto", travelReservationDTO.get());
            } else {
                model.addAttribute("recordsInfo", "No Records found for Id: " + reservationId);
            }
        } catch (InfoException e) {
            model.addAttribute("errorMsg", e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "findPages/FindByIdTravelReservationForm";
    }

    @GetMapping("/findTourPackage")
    public String findByCountry(@RequestParam(required = false)
                                String tourPackage,
                                Model model){

        System.out.println("find by the tour package :"+tourPackage);

        try{
            Optional<List<TravelReservationDTO>> carOwnershipDTOList = travelReservationService.findByTourPackage(tourPackage);

            if(carOwnershipDTOList.isPresent() && !carOwnershipDTOList.get().isEmpty()){
                model.addAttribute("list",carOwnershipDTOList.get());
            }else{
                model.addAttribute("recordsInfo","No Records found for tour package : "+tourPackage);
            }
        }catch (InfoException e){
            model.addAttribute("errorMsg",e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }

        return "findPages/FindByTourPackageTravelReservationForm";
    }

}
