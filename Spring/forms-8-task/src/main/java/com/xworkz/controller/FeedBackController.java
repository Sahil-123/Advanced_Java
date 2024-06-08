package com.xworkz.controller;

import com.xworkz.dto.FeedbackDTO;
import com.xworkz.exception.InfoException;
import com.xworkz.requestDto.RequestFeedbackDTO;
import com.xworkz.service.FeedbackService;
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
@RequestMapping("/feedback")
public class FeedBackController {

    @Autowired
    private FeedbackService feedbackService;

    @PostMapping("/submitFeedback")
    public String submitFeedback(@Valid RequestFeedbackDTO requestFeedbackDTO, BindingResult bindingResult, Model model) {
        System.out.println(requestFeedbackDTO);
        model.addAttribute("dto", requestFeedbackDTO);
        model.addAttribute("msg", "Feedback submission is successful");

        if (bindingResult.hasErrors()) {
            System.out.println("Found error");
            bindingResult.getAllErrors().forEach(System.out::println);
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "pages/FeedBackForm";
        }if (!feedbackService.save(requestFeedbackDTO)) {
            model.addAttribute("errorMsg", "Something goes wrong submission not successful.");
            return "pages/FeedBackForm";
        }

        return "pages/Success";
    }


    @GetMapping("/findName")
    public String saveApartmentSearch(@RequestParam(required = false)
                                      String name,
                                      Model model){

        System.out.println("find Feedback by the name :"+name);

        try{
            Optional<List<FeedbackDTO>> feedbackDTOList = feedbackService.findByName(name);

            if(feedbackDTOList.isPresent() && !feedbackDTOList.get().isEmpty()){
                model.addAttribute("list",feedbackDTOList.get());
            }else{
                model.addAttribute("recordsInfo","No Records found for name: "+name);
            }
        }catch (InfoException e){
            model.addAttribute("errorMsg",e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }

        return "findPages/FindByNameFeedBackForm";
    }

    @GetMapping("/findId")
    public String searchFeedBack(@RequestParam(required = false)
                                      Integer feedbackId,
                                      Model model){

        System.out.println("find Feedback by the Id :"+feedbackId);

        try{
            Optional<FeedbackDTO> feedbackDTOOptional = feedbackService.findById(feedbackId);

            if(feedbackDTOOptional.isPresent()){
                System.out.println("data found "+feedbackDTOOptional.get());
                model.addAttribute("dto",feedbackDTOOptional.get());
            }else{
                model.addAttribute("recordsInfo","No Records found for Id : "+feedbackId);
            }
        }catch (InfoException e){
            model.addAttribute("errorMsg",e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }

        return "findPages/FindByIdFeedBackForm";
    }

}
