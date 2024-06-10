package com.xworkz.repository;

import com.xworkz.dto.SetTopBoxRegistrationDTO;

import java.util.List;
import java.util.Optional;

public interface SetOfBoxRepository {
    boolean save(SetTopBoxRegistrationDTO setTopBoxRegistrationDTO);

    boolean update(Integer id,SetTopBoxRegistrationDTO setTopBoxRegistrationDTO);

    boolean delete(Integer id);

    Optional<SetTopBoxRegistrationDTO> findById(Long id);

    Optional<List<SetTopBoxRegistrationDTO>> findByCountry(String country);
}
