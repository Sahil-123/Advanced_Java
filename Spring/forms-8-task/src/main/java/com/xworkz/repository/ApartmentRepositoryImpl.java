package com.xworkz.repository;

import com.xworkz.dto.ApartmentSearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public class ApartmentRepositoryImpl implements ApartmentRepository{


    @Autowired
    private EntityManagerFactory entityManagerFactory;


    @Override
    public boolean save(ApartmentSearchDTO apartmentSearchDTO) {
        System.out.println("Repository save process is initiated using dto."+ apartmentSearchDTO);

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
           transaction.begin();
           entityManager.persist(apartmentSearchDTO);
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
    public Optional<ApartmentSearchDTO> findById(Long id) {
        System.out.println("Apartment Repository find process is initiated using Id."+ id);

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();


        try {
            Query query= entityManager.createNamedQuery("findById");
            query.setParameter("id", id);
            ApartmentSearchDTO productDtoList = (ApartmentSearchDTO) query.getSingleResult();

            System.out.println(productDtoList);
            return Optional.ofNullable(productDtoList);

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
    public Optional<List<ApartmentSearchDTO>> findByStartDate(LocalDate startDate) {
        System.out.println("Apartment Repository find process is initiated using startDate."+ startDate);

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();


        try {
            Query query= entityManager.createNamedQuery("findByStartDate");
            query.setParameter("startDate", startDate);
            List<ApartmentSearchDTO> productDtoList = (List<ApartmentSearchDTO>) query.getResultList();

            System.out.println(productDtoList);
            return Optional.ofNullable(productDtoList);

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
