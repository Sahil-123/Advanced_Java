package com.xworkz.service;


import com.xworkz.dto.NovellLoginDTO;
import com.xworkz.repository.NovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NovelServiceImpl implements NovelService {

    @Autowired
    private NovelRepository novelRepository;

    @Override
    public boolean save(NovellLoginDTO novellLoginDTO) {
        System.out.println("Novel save method is invoked for data: " + novellLoginDTO);
        // Add validation logic if needed before calling repository
        return novelRepository.save(novellLoginDTO);
    }
}
