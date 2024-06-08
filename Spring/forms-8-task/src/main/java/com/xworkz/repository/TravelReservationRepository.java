package com.xworkz.repository;

import com.xworkz.dto.TravelReservationDTO;

import java.util.List;
import java.util.Optional;

public interface TravelReservationRepository {
    boolean save(TravelReservationDTO reservationDTO);

    Optional<TravelReservationDTO> findById(Long id);

    Optional<List<TravelReservationDTO>> findByTourPackage(String tourPackage);
}
