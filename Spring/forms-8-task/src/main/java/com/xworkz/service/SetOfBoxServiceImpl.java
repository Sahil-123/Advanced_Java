package com.xworkz.service;

import com.xworkz.dto.SetTopBoxRegistrationDTO;
import com.xworkz.repository.SetOfBoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SetOfBoxServiceImpl implements SetOfBoxService {

    @Autowired
    private SetOfBoxRepository setOfBoxRepository;

    @Override
    public boolean register(SetTopBoxRegistrationDTO setTopBoxRegistrationDTO) {
        System.out.println("Set of box register method is invoked for data: " + setTopBoxRegistrationDTO);
        // Add validation logic if needed before calling repository
        return setOfBoxRepository.save(setTopBoxRegistrationDTO);
    }
}
