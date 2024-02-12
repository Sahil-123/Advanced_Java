package com.xworkz.services;

import com.xworkz.DTO.ReserviorDTO;
import com.xworkz.repository.ReserviorRepository;
import com.xworkz.repository.ReserviorRepositoryImpl;

import java.util.List;

public class ReserviorServiceImpl implements ReserviorService{

    ReserviorRepository reserviorRepository = new ReserviorRepositoryImpl();

    @Override
    public void save(ReserviorDTO reserviorDTO) {
        if(reserviorDTO.getName().isEmpty()){
            System.out.println("Please enter proper data to insert");
        }else{
            if(reserviorRepository.save(reserviorDTO)){
                System.out.println("Data insertion is successfully completed...!!");
            }else{
                System.out.println("Data insertion failed...???");
            }
        }
    }

    @Override
    public void update(String reserviorName, String reserviorPlace, String reseviorState, double reseviorHeight) {
        if(reserviorName.isEmpty()){
            System.out.println("Data insertion is successfully completed...!!");
        }else{
            boolean result = reserviorRepository.update(reserviorName, reserviorPlace, reseviorState, reseviorHeight);

            if(result){
                System.out.println("Data updation is successfully completed...!!");
            }else{
                System.out.println("Data updation failed...???");
            }
        }
    }

    @Override
    public void findAll() {
        List<ReserviorDTO> list = reserviorRepository.findAll();

        if(list.isEmpty()){
            System.out.println("No entries found...!!");
        }

        System.out.println("Data Fetching is completed...!");

        for(ReserviorDTO reserviorDTO: list){
            System.out.println(reserviorDTO);
        }
    }
}
