package com.xworkz.service;

import com.xworkz.dto.FeedbackDTO;
import com.xworkz.exception.InfoException;
import com.xworkz.repository.FeedbackRepository;
import com.xworkz.requestDto.RequestFeedbackDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public boolean save(RequestFeedbackDTO requestFeedbackDTO) {
        FeedbackDTO feedbackDTO = modelMapper.map(requestFeedbackDTO,FeedbackDTO.class);
        System.out.println("Feedback data save process...");
        return feedbackRepository.save(feedbackDTO);
    }

    @Override
    public Optional<FeedbackDTO> findById(Integer id) {
        System.out.println("feedback search by id"+id);

        if (id == null || id < 0) {
            throw new InfoException("Please provide a valid ID");
        }

        return feedbackRepository.findById((long)id);
    }

    @Override
    public Optional<List<FeedbackDTO>> findByName(String name) {
        if (name == null || name.isEmpty()) {
            throw new InfoException("Please provide a valid name");
        }
        return feedbackRepository.findByName(name);
    }
}
