package com.xworkz.controller;

import com.xworkz.dto.ProjectAssignmentDTO;
import com.xworkz.service.ProjectManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/project")
public class ProjectManagementController {

    @Autowired
    private ProjectManagementService projectManagementService;

    @PostMapping("/assignment")
    public String assignProject(@Valid ProjectAssignmentDTO projectAssignmentDTO, BindingResult bindingResult, Model model){

        System.out.println(projectAssignmentDTO);
        model.addAttribute("dto",projectAssignmentDTO);
        model.addAttribute("msg",
                "Project Assignment is successfull"
        );

        if (bindingResult.hasErrors()) {
            System.out.println("found error");
            bindingResult.getAllErrors().forEach(System.out::println);
            model.addAttribute("errors",bindingResult.getAllErrors());
            return "pages/ProjectManagement";

        }if (!projectManagementService.assign(projectAssignmentDTO)) {
            model.addAttribute("errorMsg", "Something goes wrong assignment not successful.");
            return "pages/ProjectManagement";
        }

        return "pages/Success";
    }
}
