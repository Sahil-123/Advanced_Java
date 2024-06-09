package com.xworkz.controller;

import com.xworkz.dto.ProjectAssignmentDTO;
import com.xworkz.dto.SetTopBoxRegistrationDTO;
import com.xworkz.exception.InfoException;
import com.xworkz.requestDto.RequestSetTopBoxRegistrationDTO;
import com.xworkz.service.SetOfBoxService;
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

    @GetMapping("/findId")
    public String findSetTopBoxRegistrationById(@RequestParam(required = false) Integer setTopBoxRegistrationId, Model model) {

        System.out.println("Find by the Id: " + setTopBoxRegistrationId);

        try {
            Optional<SetTopBoxRegistrationDTO> setTopBoxRegistrationDTO = setOfBoxService.findById(setTopBoxRegistrationId);

            if (setTopBoxRegistrationDTO.isPresent()) {
                model.addAttribute("dto", setTopBoxRegistrationDTO.get());
            } else {
                model.addAttribute("recordsInfo", "No Records found for Id: " + setTopBoxRegistrationId);
            }
        } catch (InfoException e) {
            model.addAttribute("errorMsg", e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "findPages/FindByIdSetupBoxForm";
    }


    @GetMapping("/findCountry")
    public String findByCountry(@RequestParam(required = false)
                                    String country,
                                    Model model){

        System.out.println("find by the country :"+country);

        try{
            Optional<List<SetTopBoxRegistrationDTO>> carOwnershipDTOList = setOfBoxService.findByCountry(country);

            if(carOwnershipDTOList.isPresent() && !carOwnershipDTOList.get().isEmpty()){
                model.addAttribute("list",carOwnershipDTOList.get());
            }else{
                model.addAttribute("recordsInfo","No Records found for country name : "+country);
            }
        }catch (InfoException e){
            model.addAttribute("errorMsg",e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }

        return "findPages/FindByCountrySetupBoxForm";
    }




}
