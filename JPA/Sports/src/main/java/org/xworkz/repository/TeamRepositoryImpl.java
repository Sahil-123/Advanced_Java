package org.xworkz.repository;

import org.xworkz.dto.Team;

import javax.persistence.*;
import java.util.List;

public class TeamRepositoryImpl implements TeamRepository{
    @Override
    public void save(Team team) {
        System.out.println( "Saving Team data....." );

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            EntityTransaction entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

//            Team team = new Team("CSK","India","Faf Duplex","Cricket");

            entityManager.persist(team);

            entityTransaction.commit();
        }catch (Exception e){
            System.out.println(e);
            entityManager.getTransaction().rollback();
        }

        finally {
            entityManager.close();
            entityManagerFactory.close();
        }

        System.out.println("Data saved successfully....");
    }

    @Override
    public void saveAll(List<Team> teams) {
        System.out.println( "Saving Team data....." );

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            EntityTransaction entityTransaction = entityManager.getTransaction();
            for(Team team :  teams){
                entityTransaction.begin();

                entityManager.persist(team);

                entityTransaction.commit();
            }
        }catch (Exception e){
            System.out.println(e);
            entityManager.getTransaction().rollback();
        }

        finally {
            entityManager.close();
            entityManagerFactory.close();
        }

        System.out.println("Data saved successfully....");
    }

    @Override
    public Team find(Integer id) {
        System.out.println("initiating find process...");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Team team = null;
        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            team = entityManager.find(Team.class,id);
//            System.out.println(team);

        }catch (Exception e){
            System.out.println("Error");
        }

        finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        return team;
    }

    @Override
    public List<Team> findByName(String name) {
        System.out.println("initiating find process...");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Team> teams = null;
        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createQuery("from Team where name =: name");
            query.setParameter("name",name);

            teams = query.getResultList();
//            System.out.println(teams);

        }catch (Exception e){
            System.out.println("Error "+e);
        }

        finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        return teams;
    }

    @Override
    public List<Team> findByCategoryType(String categoryType) {
        System.out.println("initiating find process...");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Team> teams = null;
        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createQuery("from Team where catogory_type =: catogoryType");
            query.setParameter("catogoryType",categoryType);

            teams = query.getResultList();
//            System.out.println(teams);

        }catch (Exception e){
            System.out.println("Error");
        }

        finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        return teams;
    }

    @Override
    public void update(Integer id, String teamName) {
        System.out.println("initiating update process...");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Team team = null;
        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            team = entityManager.find(Team.class,id);
            team.setName(teamName);
            transaction.commit();

            System.out.println("Updated Team name of id = "+id);
        }catch (Exception e){
            System.out.println("Exception while updating the data...."+e);
            entityManager.getTransaction().rollback();
        }

        finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }

    @Override
    public void delete(Integer id) {
        System.out.println("initiating remove process...");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Team team = entityManager.find(Team.class,id);
            entityManager.remove(team);
            transaction.commit();
        }catch (Exception e){
            System.out.println("Error");
            entityManager.getTransaction().rollback();
        }

        finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
