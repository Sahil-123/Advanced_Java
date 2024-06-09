package com.xworkz.service;


import com.xworkz.dto.NovellLoginDTO;
import com.xworkz.exception.InfoException;
import com.xworkz.repository.NovelRepository;
import com.xworkz.requestDto.RequestNovellLoginDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NovelServiceImpl implements NovelService {

    @Autowired
    private NovelRepository novelRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public boolean save(RequestNovellLoginDTO requestNovellLoginDTO) {
        NovellLoginDTO novellLoginDTO = modelMapper.map(requestNovellLoginDTO,NovellLoginDTO.class);
        System.out.println("Novell login data save process...");
        return novelRepository.save(novellLoginDTO);
    }

    @Override
    public Optional<NovellLoginDTO> findById(Integer id) {
        if (id == null || id < 0) {
            throw new InfoException("Please provide a valid ID");
        }
        return novelRepository.findById((long)id);
    }

    @Override
    public Optional<List<NovellLoginDTO>> findByEmployment(String employment) {
        if (employment == null || employment.isEmpty()) {
            throw new InfoException("Please provide a valid employment status");
        }
        return novelRepository.findByEmployment(employment);
    }
}
