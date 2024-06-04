package com.xworkz.repository;

import com.xworkz.dto.FeedbackDTO;
import org.springframework.stereotype.Repository;

@Repository
public class FeedbackRepositoryImpl implements FeedbackRepository {

    @Override
    public boolean save(FeedbackDTO feedbackDTO) {
        System.out.println("Feedback repository save method is invoked for data: " + feedbackDTO);
        // Implement actual save logic here
        return false;
    }
}
