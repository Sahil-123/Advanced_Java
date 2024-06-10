package com.xworkz.repository;

import com.xworkz.dto.SetTopBoxRegistrationDTO;
import com.xworkz.exception.InfoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Repository
public class SetOfBoxRepositoryImpl implements SetOfBoxRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(SetTopBoxRegistrationDTO setTopBoxRegistrationDTO) {
        System.out.println("Repository save process is initiated using dto." + setTopBoxRegistrationDTO);

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.persist(setTopBoxRegistrationDTO);
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
    public boolean update(Integer id,SetTopBoxRegistrationDTO setTopBoxRegistrationDTO) {
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        System.out.println("Repository update process is initiated using id." + id);

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            Query query = entityManager.createNamedQuery("deleteBySetTopBoxRegistrationId");
            query.setParameter("id", id.longValue());
            if(query.executeUpdate() <= 0){
                throw new InfoException("No records deleted for id: "+id);
            }
            transaction.commit();
            return true;
        }
        catch (InfoException e){
            throw e;
        }
        catch (PersistenceException e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
            entityManager.close();
        }

        return false;
    }

    @Override
    public Optional<SetTopBoxRegistrationDTO> findById(Long id) {
        System.out.println("SetTopBoxRegistration Repository find process is initiated using Id." + id);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            Query query = entityManager.createNamedQuery("findBySetTopBoxRegistrationId");
            query.setParameter("id", id);
            SetTopBoxRegistrationDTO setTopBoxRegistrationDTO = (SetTopBoxRegistrationDTO) query.getSingleResult();

            System.out.println(setTopBoxRegistrationDTO);
            return Optional.ofNullable(setTopBoxRegistrationDTO);
        } catch (PersistenceException e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

        return Optional.empty();
    }

    @Override
    public Optional<List<SetTopBoxRegistrationDTO>> findByCountry(String country) {
        System.out.println("SetTopBoxRegistration Repository find process is initiated using country." + country);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            Query query = entityManager.createNamedQuery("findByCountry");
            query.setParameter("country", country);
            List<SetTopBoxRegistrationDTO> setTopBoxRegistrationDTOList = (List<SetTopBoxRegistrationDTO>) query.getResultList();

            System.out.println(setTopBoxRegistrationDTOList);
            return Optional.ofNullable(setTopBoxRegistrationDTOList);
        } catch (PersistenceException e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

        return Optional.empty();
    }
}
