package org.xworkz.repository;

import org.xworkz.dto.TeamDTO;
import org.xworkz.util.EMFUtil;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TeamRepositoryImpl implements TeamRepository{
    @Override
    public void save(TeamDTO teamDTO) {
        System.out.println( "Saving Team data....." );

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            EntityTransaction entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

//            Team team = new Team("CSK","India","Faf Duplex","Cricket");

            entityManager.persist(teamDTO);

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
    public void saveAll(List<TeamDTO> teamDTOS) {
        System.out.println( "Saving Team data....." );

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            EntityTransaction entityTransaction = entityManager.getTransaction();
            for(TeamDTO teamDTO : teamDTOS){
                entityTransaction.begin();

                entityManager.persist(teamDTO);

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
    public TeamDTO find(Integer id) {
        System.out.println("initiating find process...");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        TeamDTO teamDTO = null;
        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            teamDTO = entityManager.find(TeamDTO.class,id);
//            System.out.println(team);

        }catch (Exception e){
            System.out.println("Error"+e);
        }

        finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        return teamDTO;
    }

    @Override
    public List<TeamDTO> findByName(String name) {
        System.out.println("initiating find process...");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<TeamDTO> teamDTOS = null;
        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createQuery("from Team where name =: name");
            query.setParameter("name",name);

            teamDTOS = query.getResultList();
//            System.out.println(teams);

        }catch (Exception e){
            System.out.println("Error "+e);
        }

        finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        return teamDTOS;
    }

    @Override
    public List<TeamDTO> findByCategoryType(String categoryType) {
        System.out.println("initiating find process...");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<TeamDTO> teamDTOS = null;
        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createQuery("from Team where catogory_type =: catogoryType");
            query.setParameter("catogoryType",categoryType);

            teamDTOS = query.getResultList();
//            System.out.println(teams);

        }catch (Exception e){
            System.out.println("Error"+e);
        }

        finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        return teamDTOS;
    }


    @Override
    public void update(Integer id, String teamName) {
        System.out.println("initiating update process...");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        TeamDTO teamDTO = null;
        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            teamDTO = entityManager.find(TeamDTO.class,id);
            teamDTO.setName(teamName);
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
            TeamDTO teamDTO = entityManager.find(TeamDTO.class,id);
            entityManager.remove(teamDTO);
            transaction.commit();
        }catch (Exception e){
            System.out.println("Error"+e);
            entityManager.getTransaction().rollback();
        }

        finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }

    @Override
    public Integer findCountOfRecords() {
        EntityManager entityManager = EMFUtil.getEntityManager();
        Integer countOfRecrd = 0;

        try {
            String stringQuery = "select count(t) from TeamDTO t";
            Query query= entityManager.createQuery(stringQuery);
            countOfRecrd = (Integer) query.getSingleResult();

        }catch (Exception e){
            System.out.println("Error while finding count of records in team table"+e);
        }
        finally {
            entityManager.close();
        }
        return countOfRecrd;
    }

    @Override
    public Integer getNoOfMatchesById(int id) {
        EntityManager entityManager = EMFUtil.getEntityManager();
        Integer noOfMatches = -1;

        try {
            String stringQuery = "select t.noOfMatches from TeamDTO t where t.id = :id";
            Query query= entityManager.createQuery(stringQuery);
            query.setParameter("id",id);
            noOfMatches = (Integer) query.getSingleResult();

        }catch (Exception e){
            System.out.println("Error while finding NoOfMatches By Id in team table"+e);
        }
        finally {
            entityManager.close();
        }
        return noOfMatches;
    }

    @Override
    public String findCountryByTeamName(String teamName) {
        EntityManager entityManager = EMFUtil.getEntityManager();
        String country = null;

        try {
            String stringQuery = "select t.country from TeamDTO t where t.name = :teamName";
            Query query= entityManager.createQuery(stringQuery);
            query.setParameter("teamName",teamName);
            country = (String) query.getSingleResult();

        }catch (Exception e){
            System.out.println("Error while finding NoOfMatches By Id in team table"+e);
        }
        finally {
            entityManager.close();
        }
        return country;
    }

    @Override
    public List<List<String>> findCountryAndCategoryTypeByTeamName(String teamName) {
        EntityManager entityManager = EMFUtil.getEntityManager();
        List<List<String>> data = new ArrayList<>();

        try {
            String stringQuery = "select t.country, t.catogoryType from TeamDTO t where t.name = :teamName";
            Query query= entityManager.createQuery(stringQuery);
            query.setParameter("teamName",teamName);

            List<Object[]> list = (List<Object[]>) query.getResultList();

            for(Object[] obj : list){
                List<String> innerData = new ArrayList<>();
                for(Object object : obj){
                    innerData.add((String) object);
                }
                data.add(innerData);
            }
        }catch (Exception e){
            System.out.println("Error while finding Country And CategoryType By in team table"+e);
        }
        finally {
            entityManager.close();
        }
        return data;
    }

    @Override
    public TeamDTO fetchTeamByNames(String teamName) {
        EntityManager entityManager = EMFUtil.getEntityManager();
        TeamDTO team = null;

        try {
            String stringQuery = "select t from TeamDTO t where t.name = :teamName";
            Query query= entityManager.createQuery(stringQuery);
            query.setParameter("teamName",teamName);
            team = (TeamDTO) query.getSingleResult();

        }catch (Exception e){
            System.out.println("Error while finding Team By team name in team table"+e);
        }
        finally {
            entityManager.close();
        }
        return team;
    }

    @Override
    public Integer updateCountryByTeamName(String teamName, String country) {
        EntityManager entityManager = EMFUtil.getEntityManager();
        Integer count = null;

        try {
            entityManager.getTransaction().begin();
            Query query= entityManager.createNamedQuery("updateCountryByTeamName");
            query.setParameter("teamName",teamName);
            query.setParameter("country",country);

            count = query.executeUpdate();

            entityManager.getTransaction().commit();

        }catch (Exception e){
            System.out.println("Error while updating Team country by team name in team table"+e);
            entityManager.getTransaction().rollback();
        }
        finally {
            entityManager.close();
        }
        return count;
    }

    @Override
    public Integer deleteTeamByName(String teamName) {
        EntityManager entityManager = EMFUtil.getEntityManager();
        Integer count = null;

        try {
            entityManager.getTransaction().begin();
            Query query= entityManager.createNamedQuery("deleteTeamByName");
            query.setParameter("teamName",teamName);

            count = query.executeUpdate();

            entityManager.getTransaction().commit();

        }catch (Exception e){
            System.out.println("Error while deleting Team data by team name in team table"+e);
            entityManager.getTransaction().rollback();
        }
        finally {
            entityManager.close();
        }
        return count;
    }

    @Override
    public List<List<String>> fetchTeamNameAndNoOfMatchesOfAllTeams() {
        EntityManager entityManager = EMFUtil.getEntityManager();
        List<List<String>> teams = new ArrayList<>();

        try {

            Query query= entityManager.createNamedQuery("fetchTeamNameAndNoOfMatchesOfAllTeams");
            List<Object[]> list = (List<Object[]>) query.getResultList();

            for(Object[] obj : list){
                List<String> innerData = new ArrayList<>();
                for(Object object : obj){
                    innerData.add((String) object);
                }
                teams.add(innerData);
            }

        }catch (Exception e){
            System.out.println("Error while finding all team name and team no of matches in team table"+e);
        }
        finally {
            entityManager.close();
        }
        return teams;
    }

    @Override
    public Integer fetchTotalNoOfMatchesByCategoryType(String categoryType) {
        EntityManager entityManager = EMFUtil.getEntityManager();
        Integer count = null;

        try {
            Query query= entityManager.createNamedQuery("fetchTotalNoOfMatchesByCategoryType");
            query.setParameter("categoryType",categoryType);
            count = (Integer) query.getSingleResult();

        }catch (Exception e){
            System.out.println("Error while finding sum of no of matches by category type by in team table"+e);
        }
        finally {
            entityManager.close();
        }
        return count;
    }

    @Override
    public List<TeamDTO> getTeamsOfMinNoOfMatches() {
        EntityManager entityManager = EMFUtil.getEntityManager();
        List<TeamDTO> teams = null;

        try {
            Query query= entityManager.createNamedQuery("minOfNumberOfMatches");
            Integer minOfNoOfMatches = (Integer) query.getSingleResult();

            Query query1 = entityManager.createNamedQuery("getTeamsOfMinNoOfMatches");
            query1.setParameter("noOfMatches",minOfNoOfMatches);

            teams = (List<TeamDTO>) query1.getResultList();

        }catch (Exception e){
            System.out.println("Error while finding min number of matches team in team table"+e);
        }
        finally {
            entityManager.close();
        }
        return teams;
    }

    @Override
    public List<TeamDTO> findAllTeams() {
        return null;
    }

    @Override
    public List<String> getCountries() {
        return null;
    }

    @Override
    public List<List<String>> getCountryAndTeamNameOfAllTeams() {
        return null;
    }

    @Override
    public TeamDTO findTeamByTeamName(String team) {
        return null;
    }

    @Override
    public List<TeamDTO> getTeamsByNameMatcher(String teamNameMatcher) {
        return null;
    }

    @Override
    public List<TeamDTO> findTeamsByLessThanTheNumberOfPlayer(Integer numberOfPlayers) {
        return null;
    }

    @Override
    public List<TeamDTO> findTeamsByNoOfPlayersInBetween(Integer val1, Integer val2) {
        return null;
    }

    @Override
    public List<TeamDTO> findTeamsByNameOfTeams(List<String> teamNames) {
        return null;
    }

}
