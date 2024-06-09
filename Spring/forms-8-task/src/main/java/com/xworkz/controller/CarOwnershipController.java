package com.xworkz.controller;

import com.xworkz.dto.CarOwnershipDTO;
import com.xworkz.exception.InfoException;
import com.xworkz.requestDto.RequestCarOwnershipDTO;
import com.xworkz.service.CarOwnershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


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

    @PostMapping("/save")
    public String saveCarOwned(@Valid RequestCarOwnershipDTO requestCarOwnershipDTO,
                                      BindingResult bindingResult,
                                      Model model){

        model.addAttribute("dto", requestCarOwnershipDTO);
        if (bindingResult.hasErrors()) {
            System.out.println("Found error");
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "pages/UpdateCarOwnershipInfo";
        } else if (!carOwnershipService.save(requestCarOwnershipDTO)) {
            model.addAttribute("errorMsg", "Something goes wrong submission not successful.");
            return "pages/UpdateCarOwnershipInfo";
        }

        model.addAttribute("msg", "Car ownership search data submission is successful");
        return "pages/Success";
    }

    @GetMapping("/findState")
    public String saveApartmentSearch(@RequestParam(required = false)
                                      String stateResidence,
                                      Model model){

        System.out.println("find by the carOwned :"+stateResidence);

        try{
            Optional<List<CarOwnershipDTO>> carOwnershipDTOList = carOwnershipService.findBySate(stateResidence);

            if(carOwnershipDTOList.isPresent() && !carOwnershipDTOList.get().isEmpty()){
                model.addAttribute("list",carOwnershipDTOList.get());
            }else{
                model.addAttribute("recordsInfo","No Records found for state : "+stateResidence);
            }
        }catch (InfoException e){
            model.addAttribute("errorMsg",e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }

        return "findPages/FindByStateCarOwnershipForm";
    }

    @GetMapping("/findId")
    public String saveApartmentSearch(@RequestParam(required = false)
                                      Integer carOwnerId,
                                      Model model){

        System.out.println("find by the Id :"+carOwnerId);

        try{
            Optional<CarOwnershipDTO> carOwnershipDTO = carOwnershipService.findById(carOwnerId);

            if(carOwnershipDTO.isPresent()){
                model.addAttribute("dto",carOwnershipDTO.get());
            }else{
                model.addAttribute("recordsInfo","No Records found for Id : "+carOwnerId);
            }
        }catch (InfoException e){
            model.addAttribute("errorMsg",e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }

        return "findPages/FindByIdCarOwnershipForm";
    }

}
