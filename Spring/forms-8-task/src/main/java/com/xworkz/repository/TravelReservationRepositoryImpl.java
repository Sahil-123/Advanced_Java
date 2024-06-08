package com.xworkz.repository;

import com.xworkz.dto.TravelReservationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Repository
public class TravelReservationRepositoryImpl implements TravelReservationRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(TravelReservationDTO reservationDTO) {
        System.out.println("Repository save process is initiated using dto." + reservationDTO);

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.persist(reservationDTO);
            transaction.commit();
            return true;
        } catch (PersistenceException e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
            entityManager.close();
        }

        return false;
    }

    @Override
    public Optional<TravelReservationDTO> findById(Long id) {
        System.out.println("Travel Reservation Repository find process is initiated using Id." + id);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            Query query = entityManager.createNamedQuery("findById");
            query.setParameter("id", id);
            TravelReservationDTO reservationDTO = (TravelReservationDTO) query.getSingleResult();

            System.out.println(reservationDTO);
            return Optional.ofNullable(reservationDTO);
        } catch (PersistenceException e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

        return Optional.empty();
    }

    @Override
    public Optional<List<TravelReservationDTO>> findByTourPackage(String tourPackage) {
        System.out.println("Travel Reservation Repository find process is initiated using tourPackage." + tourPackage);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            Query query = entityManager.createNamedQuery("findByTourPackage");
            query.setParameter("tourPackage", tourPackage);
            List<TravelReservationDTO> reservationDTOList = (List<TravelReservationDTO>) query.getResultList();

            System.out.println(reservationDTOList);
            return Optional.ofNullable(reservationDTOList);
        } catch (PersistenceException e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

        return Optional.empty();
    }
}
