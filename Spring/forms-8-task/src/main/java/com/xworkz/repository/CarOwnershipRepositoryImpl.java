package com.xworkz.repository;

import com.xworkz.dto.ApartmentSearchDTO;
import com.xworkz.dto.CarOwnershipDTO;
import com.xworkz.requestDto.RequestCarOwnershipDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Repository
public class CarOwnershipRepositoryImpl implements CarOwnershipRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public boolean update(CarOwnershipDTO carOwnershipDTO) {
        System.out.println("Car ownership repository update method is invoked for data: " + carOwnershipDTO);
        // Implement actual update logic here
        return false;
    }

    @Override
    public boolean save(CarOwnershipDTO carOwnershipDTO) {
        System.out.println("Repository save process is initiated using dto."+ carOwnershipDTO);

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.persist(carOwnershipDTO);
            transaction.commit();
            return true;

        }catch(PersistenceException e){
            e.printStackTrace();
            transaction.rollback();
        }

        finally {
            entityManager.close();
        }

        return false;
    }

    @Override
    public Optional<CarOwnershipDTO> findById(Long id) {
        System.out.println("Car Ownership Repository find process is initiated using Id."+ id);

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();


        try {
            Query query= entityManager.createNamedQuery("findByCarOwnerId");
            query.setParameter("id", id);
            CarOwnershipDTO carOwnershipDTO = (CarOwnershipDTO) query.getSingleResult();

            System.out.println(carOwnershipDTO);
            return Optional.ofNullable(carOwnershipDTO);

        }catch(PersistenceException e){
            e.printStackTrace();
            transaction.rollback();
        }

        finally {
            entityManager.close();
        }

        return Optional.empty();
    }

    @Override
    public Optional<List<CarOwnershipDTO>> findByCarOwned(String carOwned) {
        System.out.println("Apartment Repository find process is initiated using carOwned."+ carOwned);

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();


        try {
            Query query= entityManager.createNamedQuery("findByCarOwned");
            query.setParameter("carOwned", carOwned);
            List<CarOwnershipDTO> carOwnershipDTOList = (List<CarOwnershipDTO>) query.getResultList();

            System.out.println(carOwnershipDTOList);
            return Optional.ofNullable(carOwnershipDTOList);

        }catch(PersistenceException e){
            e.printStackTrace();
            transaction.rollback();
        }

        finally {
            entityManager.close();
        }

        return Optional.empty();
    }
}
