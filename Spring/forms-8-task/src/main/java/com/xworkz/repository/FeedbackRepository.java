package com.xworkz.repository;

import com.xworkz.dto.FeedbackDTO;

public interface FeedbackRepository {
    boolean save(FeedbackDTO feedbackDTO);
}
