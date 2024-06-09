package com.xworkz.controller;

import com.xworkz.dto.ProjectAssignmentDTO;
import com.xworkz.exception.InfoException;
import com.xworkz.requestDto.RequestProjectAssignmentDTO;
import com.xworkz.service.ProjectManagementService;
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
@RequestMapping("/project")
public class ProjectManagementController {

    @Autowired
    private ProjectManagementService projectManagementService;

    @PostMapping("/assignment")
    public String assignProject(@Valid RequestProjectAssignmentDTO requestProjectAssignmentDTO, BindingResult bindingResult, Model model){

        System.out.println(requestProjectAssignmentDTO);
        model.addAttribute("dto",requestProjectAssignmentDTO);
        model.addAttribute("msg",
                "Project Assignment is successfull"
        );

        if (bindingResult.hasErrors()) {
            System.out.println("found error");
            bindingResult.getAllErrors().forEach(System.out::println);
            model.addAttribute("errors",bindingResult.getAllErrors());
            return "pages/ProjectManagement";

        }if (!projectManagementService.save(requestProjectAssignmentDTO)) {
            model.addAttribute("errorMsg", "Something goes wrong assignment not successful.");
            return "pages/ProjectManagement";
        }

        return "pages/Success";
    }

    @GetMapping("/findId")
    public String findProjectAssignmentById(@RequestParam(required = false) Integer projectAssignmentId, Model model) {

        System.out.println("Find by the Id: " + projectAssignmentId);

        try {
            Optional<ProjectAssignmentDTO> projectAssignmentDTO = projectManagementService.findById(projectAssignmentId);

            if (projectAssignmentDTO.isPresent()) {
                model.addAttribute("dto", projectAssignmentDTO.get());
            } else {
                model.addAttribute("recordsInfo", "No Records found for Id: " + projectAssignmentId);
            }
        } catch (InfoException e) {
            model.addAttribute("errorMsg", e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "findPages/FindByIdProjectAssignmentForm";
    }


    @GetMapping("/findProjectName")
    public String findByProjectName(@RequestParam(required = false)
                                      String projectName,
                                      Model model){

        System.out.println("find by the project name :"+projectName);

        try{
            Optional<List<ProjectAssignmentDTO>> carOwnershipDTOList = projectManagementService.findByProjectName(projectName);

            if(carOwnershipDTOList.isPresent() && !carOwnershipDTOList.get().isEmpty()){
                model.addAttribute("list",carOwnershipDTOList.get());
            }else{
                model.addAttribute("recordsInfo","No Records found for project name : "+projectName);
            }
        }catch (InfoException e){
            model.addAttribute("errorMsg",e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }

        return "findPages/FindByProjectNameOfProjectAssignmentForm";
    }


}
