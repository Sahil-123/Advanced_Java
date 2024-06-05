package com.xworkz.repository;

import com.xworkz.dto.ApartmentSearchDTO;
import org.springframework.stereotype.Repository;

@Repository
public class ApartmentRepositoryImpl implements ApartmentRepository{

    @Override
    public boolean find(ApartmentSearchDTO apartmentSearchDTO) {
        System.out.println("Apartment repository find method is invoked for data : "+apartmentSearchDTO);
        return true;
    }
}
