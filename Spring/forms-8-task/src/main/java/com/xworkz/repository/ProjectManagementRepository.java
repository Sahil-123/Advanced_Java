package com.xworkz.repository;

import com.xworkz.dto.ProjectAssignmentDTO;

public interface ProjectManagementRepository {
    boolean save(ProjectAssignmentDTO projectAssignmentDTO);
}
