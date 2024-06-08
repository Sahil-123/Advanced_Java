package com.xworkz.repository;

import com.xworkz.dto.SurveyFormDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Repository
public class SurveyRepositoryImpl implements SurveyRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;


    @Override
    public boolean save(SurveyFormDTO surveyFormDTO) {
        System.out.println("Repository save process is initiated using dto." + surveyFormDTO);

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.persist(surveyFormDTO);
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
    public Optional<SurveyFormDTO> findById(Long id) {
        System.out.println("SurveyForm Repository find process is initiated using Id." + id);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            Query query = entityManager.createNamedQuery("findBySurveyFormId");
            query.setParameter("id", id);
            SurveyFormDTO surveyFormDTO = (SurveyFormDTO) query.getSingleResult();

            System.out.println(surveyFormDTO);
            return Optional.ofNullable(surveyFormDTO);
        } catch (PersistenceException e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

        return Optional.empty();
    }

    @Override
    public Optional<List<SurveyFormDTO>> findByEmailAddress(String emailAddress) {
        System.out.println("SurveyForm Repository find process is initiated using emailAddress." + emailAddress);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            Query query = entityManager.createNamedQuery("findByEmailAddress");
            query.setParameter("emailAddress", emailAddress);
            List<SurveyFormDTO> surveyFormDTOList = (List<SurveyFormDTO>) query.getResultList();

            System.out.println(surveyFormDTOList);
            return Optional.ofNullable(surveyFormDTOList);
        } catch (PersistenceException e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

        return Optional.empty();
    }
}
