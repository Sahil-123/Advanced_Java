package com.xworkz.service;

import com.xworkz.dto.FeedbackDTO;
import com.xworkz.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Override
    public boolean save(FeedbackDTO feedbackDTO) {
        System.out.println("Feedback save method is invoked for data: " + feedbackDTO);
        // Add validation logic if needed before calling repository
        return feedbackRepository.save(feedbackDTO);
    }
}
