package com.xworkz.service;

import com.xworkz.dto.CarOwnershipDTO;
import com.xworkz.requestDto.RequestCarOwnershipDTO;

import java.util.List;
import java.util.Optional;

public interface CarOwnershipService {
    boolean update(CarOwnershipDTO carOwnershipDTO);


    public boolean save(RequestCarOwnershipDTO requestCarOwnershipDTO);

    public Optional<CarOwnershipDTO> findById(Integer id);

    public Optional<List<CarOwnershipDTO>> findBySate(String carOwned);
}
