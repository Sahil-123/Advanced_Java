package com.xworkz.service;

import com.xworkz.dto.ProjectAssignmentDTO;
import com.xworkz.repository.ProjectManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectManagementServiceImpl implements ProjectManagementService {

    @Autowired
    private ProjectManagementRepository projectManagementRepository;

    @Override
    public boolean assign(ProjectAssignmentDTO projectAssignmentDTO) {
        System.out.println("Project management assign method is invoked for data: " + projectAssignmentDTO);
        // Add validation logic if needed before calling repository
        return projectManagementRepository.save(projectAssignmentDTO);
    }
}
