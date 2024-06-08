package com.xworkz.repository;

import com.xworkz.dto.NovellLoginDTO;

import java.util.List;
import java.util.Optional;

public interface NovelRepository {
    boolean save(NovellLoginDTO novellLoginDTO);

    Optional<NovellLoginDTO> findById(Long id);

    Optional<List<NovellLoginDTO>> findByEmployment(String employment);
}
