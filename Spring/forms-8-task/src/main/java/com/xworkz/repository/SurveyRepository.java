package com.xworkz.repository;

import com.xworkz.dto.SurveyFormDTO;

import java.util.List;
import java.util.Optional;

public interface SurveyRepository {
    boolean save(SurveyFormDTO surveyFormDTO);

    Optional<SurveyFormDTO> findById(Long id);

    Optional<List<SurveyFormDTO>> findByEmailAddress(String emailAddress);
}
