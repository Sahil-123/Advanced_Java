package com.xworkz.repository;

import com.xworkz.dto.NovellLoginDTO;
import org.springframework.stereotype.Repository;

@Repository
public class NovelRepositoryImpl implements NovelRepository {

    @Override
    public boolean save(NovellLoginDTO novellLoginDTO) {
        System.out.println("Novel repository save method is invoked for data: " + novellLoginDTO);
        // Implement actual save logic here
        return false;
    }
}
