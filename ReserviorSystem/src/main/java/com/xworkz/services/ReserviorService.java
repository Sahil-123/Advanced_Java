package com.xworkz.services;

import com.xworkz.DTO.ReserviorDTO;

public interface ReserviorService {
    public void save(ReserviorDTO reserviorDTO);

    public void update(String reserviorName, String reserviorPlace, String reseviorState, double reseviorHeight);


    public void findAll();

}
