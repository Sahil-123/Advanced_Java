package com.xworkz.service;

import com.xworkz.dto.ApartmentSearchDTO;
import com.xworkz.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApartmentServiceImpl implements ApartmentService{

    @Autowired
    private ApartmentRepository apartmentRepository;

    @Override
    public boolean search(ApartmentSearchDTO apartmentSearchDTO) {
        System.out.println("Apartment search method is invoked for the data : "+apartmentSearchDTO);
        return apartmentRepository.find(apartmentSearchDTO);
    }
}
