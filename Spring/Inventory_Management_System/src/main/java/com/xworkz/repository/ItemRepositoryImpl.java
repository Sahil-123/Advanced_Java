package com.xworkz.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;

@Repository
public class ItemRepositoryImpl implements ItemRepository{


    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public void save() {

    }
}
