package com.xworkz.service;

import com.xworkz.dto.TravelReservationDTO;
import com.xworkz.requestDto.RequestTravelReservationDTO;

import java.util.List;
import java.util.Optional;

public interface TravelReservationService {
    boolean save(RequestTravelReservationDTO reservationDTO);

    Optional<TravelReservationDTO> findById(Integer id);

    Optional<List<TravelReservationDTO>> findByTourPackage(String tourPackage);
}
