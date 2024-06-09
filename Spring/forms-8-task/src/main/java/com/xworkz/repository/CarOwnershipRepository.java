package com.xworkz.repository;

import com.xworkz.dto.CarOwnershipDTO;
import com.xworkz.requestDto.RequestCarOwnershipDTO;

import java.util.List;
import java.util.Optional;

public interface CarOwnershipRepository {
    boolean update(CarOwnershipDTO carOwnershipDTO);

    public boolean save(CarOwnershipDTO carOwnershipDTO);

    public Optional<CarOwnershipDTO> findById(Long id);

    public Optional<List<CarOwnershipDTO>> findBySate(String state);
}
