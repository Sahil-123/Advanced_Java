package com.xworkz.controller;

import com.xworkz.dto.NovellLoginDTO;
import com.xworkz.service.NovelService;
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
@RequestMapping("/novel")
public class NovelController {

    @Autowired
    private NovelService novelService;

    @PostMapping("/submitNovellLogin")
    public String submitNovellLogin(@Valid @ModelAttribute("dto") NovellLoginDTO novellLoginDTO,
                                    BindingResult bindingResult, Model model) {

        System.out.println(novellLoginDTO);
        model.addAttribute("dto", novellLoginDTO);
        model.addAttribute("msg", "Novel Login data submission is successful");

        if (bindingResult.hasErrors()) {
            System.out.println("Found error");
            bindingResult.getAllErrors().forEach(System.out::println);
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "pages/NovelLoginForm";
        }else if (!novelService.save(novellLoginDTO)) {
            model.addAttribute("errorMsg", "Something goes wrong saving not successful.");
            return "pages/NovelLoginForm";
        }


        return "pages/Success";

    }
}
