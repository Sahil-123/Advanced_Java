package com.xworkz.repository;

import com.xworkz.dto.FeedbackDTO;

import java.util.List;
import java.util.Optional;

public interface FeedbackRepository {

    boolean save(FeedbackDTO feedbackDTO);

    public Optional<FeedbackDTO> findById(Long id);

    Optional<List<FeedbackDTO>> findByName(String name);
}
