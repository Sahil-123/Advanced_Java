package com.xworkz.service;

import com.xworkz.dto.ProjectAssignmentDTO;
import com.xworkz.requestDto.RequestProjectAssignmentDTO;

import java.util.List;
import java.util.Optional;

public interface ProjectManagementService {
    boolean save(RequestProjectAssignmentDTO projectAssignmentDTO);

    Optional<ProjectAssignmentDTO> findById(Long id);

    Optional<List<ProjectAssignmentDTO>> findByProjectName(String projectName);
}
