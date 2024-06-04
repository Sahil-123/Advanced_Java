package com.xworkz.repository;

import com.xworkz.dto.SurveyFormDTO;
import org.springframework.stereotype.Repository;

@Repository
public class SurveyRepositoryImpl implements SurveyRepository {

    @Override
    public boolean save(SurveyFormDTO surveyFormDTO) {
        System.out.println("Survey repository save method is invoked for data: " + surveyFormDTO);
        // Implement actual save logic here
        return false;
    }
}
