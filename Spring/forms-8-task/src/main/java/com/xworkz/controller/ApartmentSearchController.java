package com.xworkz.controller;

import com.xworkz.dto.ApartmentSearchDTO;
import com.xworkz.exception.InfoException;
import com.xworkz.requestDto.RequestApartmentSearchDTO;
import com.xworkz.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/apartment")
public class ApartmentSearchController {

    @Autowired
    private ApartmentService apartmentService;

    @PostMapping("/save")
    public String saveApartmentSearch(@Valid RequestApartmentSearchDTO requestApartmentSearchDTO,
                                        BindingResult bindingResult,
                                        Model model){

        model.addAttribute("dto", requestApartmentSearchDTO);
        if (bindingResult.hasErrors()) {
            System.out.println("Found error");
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "pages/ApartmentSearch";
        } else if (!apartmentService.save(requestApartmentSearchDTO)) {
            model.addAttribute("errorMsg", "Something goes wrong submission not successful.");
            return "pages/ApartmentSearch";
        }

        model.addAttribute("msg", "Apartment search data submission is successful");
        return "pages/Success";
    }

    @GetMapping("/findStartDate")
    public String saveApartmentSearch(@RequestParam(required = false)
                                          @DateTimeFormat(pattern = "yyyy-MM-dd")
                                          LocalDate startDate,
                                      Model model){

        System.out.println("find product by the startDate :"+startDate);

        try{
            Optional<List<ApartmentSearchDTO>> apartmentSearchDTOList = apartmentService.findByStartDate(startDate);

            if(apartmentSearchDTOList.isPresent() && !apartmentSearchDTOList.get().isEmpty()){
                model.addAttribute("list",apartmentSearchDTOList.get());
            }else{
                model.addAttribute("recordsInfo","No Records found for Start Date : "+startDate);
            }
        }catch (InfoException e){
            model.addAttribute("errorMsg",e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }

        return "findPages/FindByStartDateApartment";
    }

    @GetMapping("/findId")
    public String saveApartmentSearch(@RequestParam(required = false)
                                      @DateTimeFormat(pattern = "yyyy-MM-dd")
                                      Integer searchId,
                                      Model model){

        System.out.println("find product by the Id :"+searchId);

        try{
            Optional<ApartmentSearchDTO> apartmentSearchDTOList = apartmentService.findById(searchId);

            if(apartmentSearchDTOList.isPresent()){
                model.addAttribute("dto",apartmentSearchDTOList.get());
            }else{
                model.addAttribute("recordsInfo","No Records found for Id : "+searchId);
            }
        }catch (InfoException e){
            model.addAttribute("errorMsg",e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }

        return "findPages/FindByIdApartment";
    }
}
