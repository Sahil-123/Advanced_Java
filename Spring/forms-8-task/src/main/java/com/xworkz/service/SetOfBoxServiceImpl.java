package com.xworkz.service;

import com.xworkz.dto.SetTopBoxRegistrationDTO;
import com.xworkz.exception.InfoException;
import com.xworkz.repository.SetOfBoxRepository;
import com.xworkz.requestDto.RequestSetTopBoxRegistrationDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SetOfBoxServiceImpl implements SetOfBoxService {

    @Autowired
    private SetOfBoxRepository setOfBoxRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public boolean save(RequestSetTopBoxRegistrationDTO requestSetTopBoxRegistrationDTO) {
        SetTopBoxRegistrationDTO setTopBoxRegistrationDTO = modelMapper.map(requestSetTopBoxRegistrationDTO,SetTopBoxRegistrationDTO.class);

        System.out.println("Set top box registration data save process...");
        return setOfBoxRepository.save(setTopBoxRegistrationDTO);
    }

    @Override
    public boolean update(Integer id,RequestSetTopBoxRegistrationDTO requestSetTopBoxRegistrationDTO) {
        SetTopBoxRegistrationDTO setTopBoxRegistrationDTO = modelMapper.map(requestSetTopBoxRegistrationDTO,SetTopBoxRegistrationDTO.class);

        System.out.println("Set top box update data save process...");
        return setOfBoxRepository.update(id,setTopBoxRegistrationDTO);
    }

    @Override
    public boolean delete(Integer id) {
        if (id == null || id < 0) {
            throw new InfoException("Please provide a valid ID");
        }
        return setOfBoxRepository.delete(id);
    }

    @Override
    public Optional<SetTopBoxRegistrationDTO> findById(Integer id) {
        if (id == null || id < 0) {
            throw new InfoException("Please provide a valid ID");
        }
        return setOfBoxRepository.findById(id.longValue());
    }

    @Override
    public Optional<List<SetTopBoxRegistrationDTO>> findByCountry(String country) {
        if (country == null || country.isEmpty()) {
            throw new InfoException("Please provide a valid country");
        }
        return setOfBoxRepository.findByCountry(country);
    }
}
