package com.xworkz.service;

import com.xworkz.dto.SurveyFormDTO;
import com.xworkz.requestDto.RequestSurveyFormDTO;

import java.util.List;
import java.util.Optional;

public interface SurveyService {
    boolean save(RequestSurveyFormDTO surveyFormDTO);

    Optional<SurveyFormDTO> findById(Integer id);

    Optional<List<SurveyFormDTO>> findByEmailAddress(String emailAddress);
}
