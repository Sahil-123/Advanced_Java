package com.xworkz.service;

import com.xworkz.dto.SetTopBoxRegistrationDTO;
import com.xworkz.requestDto.RequestSetTopBoxRegistrationDTO;

import java.util.List;
import java.util.Optional;

public interface SetOfBoxService {
    boolean save(RequestSetTopBoxRegistrationDTO setTopBoxRegistrationDTO);

    Optional<SetTopBoxRegistrationDTO> findById(Long id);

    Optional<List<SetTopBoxRegistrationDTO>> findByCountry(String country);
}
