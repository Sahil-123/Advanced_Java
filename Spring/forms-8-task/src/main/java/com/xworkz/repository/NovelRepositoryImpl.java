package com.xworkz.repository;

import com.xworkz.dto.NovellLoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Repository
public class NovelRepositoryImpl implements NovelRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;


    @Override
    public boolean save(NovellLoginDTO novellLoginDTO) {
        System.out.println("Repository save process is initiated using dto." + novellLoginDTO);

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.persist(novellLoginDTO);
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
    public Optional<NovellLoginDTO> findById(Long id) {
        System.out.println("Novell Login Repository find process is initiated using Id." + id);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            Query query = entityManager.createNamedQuery("findByNovellLoginId");
            query.setParameter("id", id);
            NovellLoginDTO novellLoginDTO = (NovellLoginDTO) query.getSingleResult();

            System.out.println(novellLoginDTO);
            return Optional.ofNullable(novellLoginDTO);
        } catch (PersistenceException e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

        return Optional.empty();
    }

    @Override
    public Optional<List<NovellLoginDTO>> findByEmployment(String employment) {
        System.out.println("Novell Login Repository find process is initiated using employment." + employment);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            Query query = entityManager.createNamedQuery("findByEmployment");
            query.setParameter("employment", employment);
            List<NovellLoginDTO> novellLoginDTOList = (List<NovellLoginDTO>) query.getResultList();

            System.out.println(novellLoginDTOList);
            return Optional.ofNullable(novellLoginDTOList);
        } catch (PersistenceException e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

        return Optional.empty();
    }
}
