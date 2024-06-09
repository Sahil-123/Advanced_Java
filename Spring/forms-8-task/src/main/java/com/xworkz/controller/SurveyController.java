package com.xworkz.controller;

import com.xworkz.dto.SetTopBoxRegistrationDTO;
import com.xworkz.dto.SurveyFormDTO;
import com.xworkz.exception.InfoException;
import com.xworkz.requestDto.RequestSurveyFormDTO;
import com.xworkz.service.SurveyService;
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
@RequestMapping("survey")
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @PostMapping("/submitSurvey")
    public String submitSurvey(@Valid RequestSurveyFormDTO requestSurveyFormDTO, BindingResult bindingResult, Model model) {
        System.out.println(requestSurveyFormDTO);
        model.addAttribute("dto", requestSurveyFormDTO);
        model.addAttribute("msg", "Survey submission is successful");

        if (bindingResult.hasErrors()) {
            System.out.println("Found error");
            bindingResult.getAllErrors().forEach(System.out::println);
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "pages/ServeyForm";
        }else if (!surveyService.save(requestSurveyFormDTO)) {
            model.addAttribute("errorMsg", "Something goes wrong survey submit not successful.");
            return "pages/ServeyForm";
        }

        return "pages/Success";
    }


    @GetMapping("/findId")
    public String findSurveyFormById(@RequestParam(required = false) Integer surveyFormId, Model model) {

        System.out.println("Find by the Id: " + surveyFormId);

        try {
            Optional<SurveyFormDTO> surveyFormDTO = surveyService.findById(surveyFormId);

            if (surveyFormDTO.isPresent()) {
                model.addAttribute("dto", surveyFormDTO.get());
            } else {
                model.addAttribute("recordsInfo", "No Records found for Id: " + surveyFormId);
            }
        } catch (InfoException e) {
            model.addAttribute("errorMsg", e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "findPages/FindByIdSurveyForm";
    }


    @GetMapping("/findEmailAddress")
    public String findByCountry(@RequestParam(required = false)
                                String emailAddress,
                                Model model){

        System.out.println("find by the emailAddress :"+emailAddress);

        try{
            Optional<List<SurveyFormDTO>> carOwnershipDTOList = surveyService.findByEmailAddress(emailAddress);

            if(carOwnershipDTOList.isPresent() && !carOwnershipDTOList.get().isEmpty()){
                model.addAttribute("list",carOwnershipDTOList.get());
            }else{
                model.addAttribute("recordsInfo","No Records found for emailAddress : "+emailAddress);
            }
        }catch (InfoException e){
            model.addAttribute("errorMsg",e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }

        return "findPages/FindByEmailSurveyForm";
    }


}
