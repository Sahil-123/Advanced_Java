package com.xworkz.service;


import com.xworkz.dto.SurveyFormDTO;
import com.xworkz.exception.InfoException;
import com.xworkz.repository.SurveyRepository;
import com.xworkz.requestDto.RequestSurveyFormDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyServiceImpl implements SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public boolean save(RequestSurveyFormDTO requestSurveyFormDTO) {
        SurveyFormDTO surveyFormDTO=modelMapper.map(requestSurveyFormDTO,SurveyFormDTO.class);
        System.out.println("Survey form data save process...");
        return surveyRepository.save(surveyFormDTO);
    }

    @Override
    public Optional<SurveyFormDTO> findById(Long id) {
        if (id == null || id < 0) {
            throw new InfoException("Please provide a valid ID");
        }
        return surveyRepository.findById(id);
    }

    @Override
    public Optional<List<SurveyFormDTO>> findByEmailAddress(String emailAddress) {
        if (emailAddress == null || emailAddress.isEmpty()) {
            throw new InfoException("Please provide a valid email address");
        }
        return surveyRepository.findByEmailAddress(emailAddress);
    }
}
