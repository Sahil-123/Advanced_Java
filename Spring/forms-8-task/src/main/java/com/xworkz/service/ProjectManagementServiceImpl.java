package com.xworkz.service;

import com.xworkz.dto.ProjectAssignmentDTO;
import com.xworkz.exception.InfoException;
import com.xworkz.repository.ProjectManagementRepository;
import com.xworkz.requestDto.RequestProjectAssignmentDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectManagementServiceImpl implements ProjectManagementService {

    @Autowired
    private ProjectManagementRepository projectManagementRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public boolean save(RequestProjectAssignmentDTO requestProjectAssignmentDTO) {
        ProjectAssignmentDTO projectAssignmentDTO = modelMapper.map(requestProjectAssignmentDTO,ProjectAssignmentDTO.class);

        System.out.println("Project assignment data save process...");
        return projectManagementRepository.save(projectAssignmentDTO);
    }

    @Override
    public Optional<ProjectAssignmentDTO> findById(Integer id) {
        if (id == null || id < 0) {
            throw new InfoException("Please provide a valid ID");
        }
        return projectManagementRepository.findById((long)id);
    }

    @Override
    public Optional<List<ProjectAssignmentDTO>> findByProjectName(String projectName) {
        if (projectName == null || projectName.isEmpty()) {
            throw new InfoException("Please provide a valid project name");
        }
        return projectManagementRepository.findByProjectName(projectName);
    }
}
