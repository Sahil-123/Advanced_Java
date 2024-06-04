package com.xworkz.repository;

import com.xworkz.dto.SetTopBoxRegistrationDTO;
import org.springframework.stereotype.Repository;

@Repository
public class SetOfBoxRepositoryImpl implements SetOfBoxRepository {

    @Override
    public boolean save(SetTopBoxRegistrationDTO setTopBoxRegistrationDTO) {
        System.out.println("Set of box repository save method is invoked for data: " + setTopBoxRegistrationDTO);
        // Implement actual save logic here
        return false;
    }
}
