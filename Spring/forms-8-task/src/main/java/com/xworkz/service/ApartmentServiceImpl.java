package com.xworkz.service;

import com.xworkz.dto.ApartmentSearchDTO;
import com.xworkz.exception.InfoException;
import com.xworkz.repository.ApartmentRepository;
import com.xworkz.requestDto.RequestApartmentSearchDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ApartmentServiceImpl implements ApartmentService{

    @Autowired
    private ApartmentRepository apartmentRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public boolean save(RequestApartmentSearchDTO requestApartmentSearchDTO) {
        System.out.println("Apartment search data save process...");
        ApartmentSearchDTO apartmentSearchDTO = modelMapper.map(requestApartmentSearchDTO,ApartmentSearchDTO.class);
        return apartmentRepository.save(apartmentSearchDTO);
    }

    @Override
    public Optional<ApartmentSearchDTO> findById(Integer id) {

        if(id == null || id < 0){
            throw new InfoException("Please enter search Id to search");
        }

        return apartmentRepository.findById((long)id);
    }

    @Override
    public Optional<List<ApartmentSearchDTO>> findByStartDate(LocalDate date) {

        if(date == null){
            throw new InfoException("Please enter date to search");
        }

        return apartmentRepository.findByStartDate(date);
    }
}
