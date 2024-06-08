package com.xworkz.repository;

import com.xworkz.dto.ProjectAssignmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Repository
public class ProjectManagementRepositoryImpl implements ProjectManagementRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(ProjectAssignmentDTO projectAssignmentDTO) {
        System.out.println("Repository save process is initiated using dto." + projectAssignmentDTO);

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.persist(projectAssignmentDTO);
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
    public Optional<ProjectAssignmentDTO> findById(Long id) {
        System.out.println("Project Assignment Repository find process is initiated using Id." + id);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            Query query = entityManager.createNamedQuery("findByProjectAssignmentId");
            query.setParameter("id", id);
            ProjectAssignmentDTO projectAssignmentDTO = (ProjectAssignmentDTO) query.getSingleResult();

            System.out.println(projectAssignmentDTO);
            return Optional.ofNullable(projectAssignmentDTO);
        } catch (PersistenceException e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

        return Optional.empty();
    }

    @Override
    public Optional<List<ProjectAssignmentDTO>> findByProjectName(String projectName) {
        System.out.println("Project Assignment Repository find process is initiated using projectName." + projectName);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            Query query = entityManager.createNamedQuery("findByProjectName");
            query.setParameter("projectName", projectName);
            List<ProjectAssignmentDTO> projectAssignmentDTOList = (List<ProjectAssignmentDTO>) query.getResultList();

            System.out.println(projectAssignmentDTOList);
            return Optional.ofNullable(projectAssignmentDTOList);
        } catch (PersistenceException e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

        return Optional.empty();
    }
}
