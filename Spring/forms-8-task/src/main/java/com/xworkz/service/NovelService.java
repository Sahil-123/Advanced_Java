package com.xworkz.service;

import com.xworkz.dto.NovellLoginDTO;
import com.xworkz.requestDto.RequestNovellLoginDTO;

import java.util.List;
import java.util.Optional;

public interface NovelService {
    boolean save(RequestNovellLoginDTO novellLoginDTO);

    Optional<NovellLoginDTO> findById(Long id);

    Optional<List<NovellLoginDTO>> findByEmployment(String employment);
}
