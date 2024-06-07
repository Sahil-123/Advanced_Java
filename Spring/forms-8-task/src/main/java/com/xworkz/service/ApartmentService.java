package com.xworkz.service;

import com.xworkz.dto.ApartmentSearchDTO;
import com.xworkz.requestDto.RequestApartmentSearchDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ApartmentService {
    public boolean save(RequestApartmentSearchDTO apartmentSearchDTO);

    public Optional<ApartmentSearchDTO> findById(Integer id);

    public Optional<List<ApartmentSearchDTO>> findByStartDate(LocalDate date);

}
