package com.xworkz.service;

import com.xworkz.dto.TravelReservationDTO;
import com.xworkz.exception.InfoException;
import com.xworkz.repository.TravelReservationRepository;
import com.xworkz.requestDto.RequestTravelReservationDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TravelReservationServiceImpl implements TravelReservationService {

    @Autowired
    private TravelReservationRepository travelReservationRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public boolean save(RequestTravelReservationDTO requestTravelReservationDTO) {
        TravelReservationDTO travelReservationDTO = modelMapper.map(requestTravelReservationDTO,TravelReservationDTO.class);
        System.out.println("Travel reservation data save process...");
        return travelReservationRepository.save(travelReservationDTO);
    }

    @Override
    public Optional<TravelReservationDTO> findById(Integer id) {
        if (id == null || id < 0) {
            throw new InfoException("Please provide a valid ID");
        }
        return travelReservationRepository.findById(id.longValue());
    }

    @Override
    public Optional<List<TravelReservationDTO>> findByTourPackage(String tourPackage) {
        if (tourPackage == null || tourPackage.isEmpty()) {
            throw new InfoException("Please provide a valid tour package");
        }
        return travelReservationRepository.findByTourPackage(tourPackage);
    }
}
