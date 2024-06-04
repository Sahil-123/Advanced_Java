package com.xworkz.repository;

import com.xworkz.dto.TravelReservationDTO;
import org.springframework.stereotype.Repository;

@Repository
public class TravelReservationRepositoryImpl implements TravelReservationRepository {

    @Override
    public boolean save(TravelReservationDTO travelReservationDTO) {
        System.out.println("Travel reservation repository save method is invoked for data: " + travelReservationDTO);
        // Implement actual save logic here
        return false;
    }
}
