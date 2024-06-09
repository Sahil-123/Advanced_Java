package com.xworkz.service;

import com.xworkz.dto.CarOwnershipDTO;
import com.xworkz.exception.InfoException;
import com.xworkz.repository.CarOwnershipRepository;
import com.xworkz.requestDto.RequestCarOwnershipDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarOwnershipServiceImpl implements CarOwnershipService {

    @Autowired
    private CarOwnershipRepository carOwnershipRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public boolean update(CarOwnershipDTO carOwnershipDTO) {
        System.out.println("Car ownership update method is invoked for data: " + carOwnershipDTO);
        // Add validation logic if needed before calling repository
        return carOwnershipRepository.update(carOwnershipDTO);
    }

    @Override
    public boolean save(RequestCarOwnershipDTO requestCarOwnershipDTO) {
        CarOwnershipDTO carOwnershipDTO = modelMapper.map(requestCarOwnershipDTO,CarOwnershipDTO.class);
        return carOwnershipRepository.save(carOwnershipDTO);
    }

    @Override
    public Optional<CarOwnershipDTO> findById(Integer id) {
        if(id == null || id < 0){
            throw new InfoException("Please enter search Id to search");
        }

        return carOwnershipRepository.findById((long)id);
    }

    @Override
    public Optional<List<CarOwnershipDTO>> findBySate(String state) {

        if(state == null || state.isEmpty()){
            throw new InfoException("Please enter valid to State name");
        }

        return carOwnershipRepository.findBySate(state);
    }
}
