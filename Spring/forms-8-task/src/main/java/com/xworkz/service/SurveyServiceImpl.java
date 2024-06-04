package com.xworkz.service;


import com.xworkz.dto.SurveyFormDTO;
import com.xworkz.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveyServiceImpl implements SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;

    @Override
    public boolean save(SurveyFormDTO surveyFormDTO) {
        System.out.println("Survey save method is invoked for data: " + surveyFormDTO);
        // Add validation logic if needed before calling repository
        return surveyRepository.save(surveyFormDTO);
    }
}
