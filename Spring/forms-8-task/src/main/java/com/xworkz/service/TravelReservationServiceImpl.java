package com.xworkz.service;

import com.xworkz.dto.TravelReservationDTO;
import com.xworkz.repository.TravelReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TravelReservationServiceImpl implements TravelReservationService {

    @Autowired
    private TravelReservationRepository travelReservationRepository;

    @Override
    public boolean reserve(TravelReservationDTO travelReservationDTO) {
        System.out.println("Travel reservation reserve method is invoked for data: " + travelReservationDTO);
        // Add validation logic if needed before calling repository
        return travelReservationRepository.save(travelReservationDTO);
    }
}
