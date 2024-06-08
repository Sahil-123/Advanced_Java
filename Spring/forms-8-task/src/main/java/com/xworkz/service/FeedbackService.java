package com.xworkz.service;

import com.xworkz.dto.FeedbackDTO;
import com.xworkz.requestDto.RequestFeedbackDTO;

import java.util.List;
import java.util.Optional;

public interface FeedbackService {
    boolean save(RequestFeedbackDTO feedbackDTO);

    Optional<FeedbackDTO> findById(Integer id);

    Optional<List<FeedbackDTO>> findByName(String name);
}
