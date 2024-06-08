package com.xworkz.repository;

import com.xworkz.dto.ProjectAssignmentDTO;

import java.util.List;
import java.util.Optional;

public interface ProjectManagementRepository {
    boolean save(ProjectAssignmentDTO projectAssignmentDTO);

    Optional<ProjectAssignmentDTO> findById(Long id);

    Optional<List<ProjectAssignmentDTO>> findByProjectName(String projectName);
}
