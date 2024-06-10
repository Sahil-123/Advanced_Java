package com.xworkz.service;

import com.xworkz.dto.SetTopBoxRegistrationDTO;
import com.xworkz.requestDto.RequestSetTopBoxRegistrationDTO;

import java.util.List;
import java.util.Optional;

public interface SetOfBoxService {
    boolean save(RequestSetTopBoxRegistrationDTO setTopBoxRegistrationDTO);

    boolean update(Integer id,RequestSetTopBoxRegistrationDTO setTopBoxRegistrationDTO);

    boolean delete(Integer id);

    Optional<SetTopBoxRegistrationDTO> findById(Integer id);

    Optional<List<SetTopBoxRegistrationDTO>> findByCountry(String country);
}
