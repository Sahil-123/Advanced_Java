package com.xworkz.controller;

import com.xworkz.dto.CarOwnershipDTO;
import com.xworkz.dto.NovellLoginDTO;
import com.xworkz.exception.InfoException;
import com.xworkz.requestDto.RequestNovellLoginDTO;
import com.xworkz.service.NovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/novel")
public class NovelController {

    @Autowired
    private NovelService novelService;

    @PostMapping("/submitNovellLogin")
    public String submitNovellLogin(@Valid RequestNovellLoginDTO requestNovellLoginDTO,
                                    BindingResult bindingResult, Model model) {

        System.out.println(requestNovellLoginDTO);
        model.addAttribute("dto", requestNovellLoginDTO);
        model.addAttribute("msg", "Novel Login data submission is successful");

        if (bindingResult.hasErrors()) {
            System.out.println("Found error");
            bindingResult.getAllErrors().forEach(System.out::println);
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "pages/NovelLoginForm";
        }else if (!novelService.save(requestNovellLoginDTO)) {
            model.addAttribute("errorMsg", "Something goes wrong saving not successful.");
            return "pages/NovelLoginForm";
        }

        return "pages/Success";
    }


    @GetMapping("/findId")
    public String findNovellLoginById(@RequestParam(required = false) Integer novellLoginId, Model model) {

        System.out.println("Find by the Id: " + novellLoginId);

        try {
            Optional<NovellLoginDTO> novellLoginDTO = novelService.findById(novellLoginId);

            if (novellLoginDTO.isPresent()) {
                model.addAttribute("dto", novellLoginDTO.get());
            } else {
                model.addAttribute("recordsInfo", "No Records found for Id: " + novellLoginId);
            }
        } catch (InfoException e) {
            model.addAttribute("errorMsg", e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "findPages/FindByIdNovelForm";
    }

    @GetMapping("/findEmployment")
    public String saveApartmentSearch(@RequestParam(required = false)
                                      String employment,
                                      Model model){

        System.out.println("find by the employment :"+employment);

        try{
            Optional<List<NovellLoginDTO>> novellLoginDTOList = novelService.findByEmployment(employment);

            if(novellLoginDTOList.isPresent() && !novellLoginDTOList.get().isEmpty()){
                model.addAttribute("list",novellLoginDTOList.get());
            }else{
                model.addAttribute("recordsInfo","No Records found for Employment : "+employment);
            }
        }catch (InfoException e){
            model.addAttribute("errorMsg",e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }

        return "findPages/FindByEmploymentNovelForm";
    }

}
