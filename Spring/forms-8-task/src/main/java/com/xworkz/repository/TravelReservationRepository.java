package com.xworkz.repository;

import com.xworkz.dto.TravelReservationDTO;

public interface TravelReservationRepository {
    boolean save(TravelReservationDTO travelReservationDTO);
}
