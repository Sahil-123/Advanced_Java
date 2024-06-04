package com.xworkz.service;

import com.xworkz.dto.CarOwnershipDTO;
import com.xworkz.repository.CarOwnershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarOwnershipServiceImpl implements CarOwnershipService {

    @Autowired
    private CarOwnershipRepository carOwnershipRepository;

    @Override
    public boolean update(CarOwnershipDTO carOwnershipDTO) {
        System.out.println("Car ownership update method is invoked for data: " + carOwnershipDTO);
        // Add validation logic if needed before calling repository
        return carOwnershipRepository.update(carOwnershipDTO);
    }
}
