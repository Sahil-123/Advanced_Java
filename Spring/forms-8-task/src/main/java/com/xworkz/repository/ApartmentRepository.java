package com.xworkz.repository;

import com.xworkz.dto.ApartmentSearchDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ApartmentRepository {

    public boolean save(ApartmentSearchDTO apartmentSearchDTO);

    public Optional<ApartmentSearchDTO> findById(Long id);

    public Optional<List<ApartmentSearchDTO>> findByStartDate(LocalDate localDate);




}
