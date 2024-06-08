package com.xworkz.repository;

import com.xworkz.dto.FeedbackDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Repository
public class FeedbackRepositoryImpl implements FeedbackRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(FeedbackDTO feedbackDTO) {
        System.out.println("Repository save process is initiated using dto." + feedbackDTO);

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.persist(feedbackDTO);
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
    public Optional<FeedbackDTO> findById(Long id) {
        System.out.println("Feedback Repository find process is initiated using Id." + id);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            Query query = entityManager.createNamedQuery("findByFeedbackId");
            query.setParameter("id", id);
            FeedbackDTO feedbackDTO = (FeedbackDTO) query.getSingleResult();

            System.out.println(feedbackDTO);
            return Optional.ofNullable(feedbackDTO);
        } catch (PersistenceException e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

        return Optional.empty();
    }

    @Override
    public Optional<List<FeedbackDTO>> findByName(String name) {
        System.out.println("Feedback Repository find process is initiated using name." + name);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            Query query = entityManager.createNamedQuery("findByName");
            query.setParameter("name", name);
            List<FeedbackDTO> feedbackDTOList = (List<FeedbackDTO>) query.getResultList();

            System.out.println(feedbackDTOList);
            return Optional.ofNullable(feedbackDTOList);
        } catch (PersistenceException e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

        return Optional.empty();
    }


}
