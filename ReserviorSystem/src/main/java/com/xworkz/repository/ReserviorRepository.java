package com.xworkz.repository;

import com.xworkz.DTO.ReserviorDTO;

import java.util.List;

public interface ReserviorRepository {

    public boolean save(ReserviorDTO reserviorDTO);

    public boolean update(String reserviorName, String reserviorPlace, String reseviorState, double reseviorHeight);

    public List<ReserviorDTO> findAll();

}
