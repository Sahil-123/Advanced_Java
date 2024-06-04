package com.xworkz.repository;

import com.xworkz.dto.ApartmentSearchDTO;

public interface ApartmentRepository {
    public boolean find(ApartmentSearchDTO apartmentSearchDTO);
}
