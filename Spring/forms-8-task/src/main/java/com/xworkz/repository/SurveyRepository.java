package com.xworkz.repository;

import com.xworkz.dto.SurveyFormDTO;

public interface SurveyRepository {
    boolean save(SurveyFormDTO surveyFormDTO);
}
