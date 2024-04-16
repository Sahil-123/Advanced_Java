package org.xworkz;

import org.w3c.dom.ls.LSInput;
import org.xworkz.dto.Team;
import org.xworkz.repository.TeamRepositoryImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Loading....." );
        TeamRepositoryImpl teamRepositoryImpl = new TeamRepositoryImpl();

//        teamRepositoryImpl.update(6,"MI");
//
//        teamRepositoryImpl.delete(6);
//
//        Team team = teamRepositoryImpl.find(6);
//        System.out.println(team);

//        List<Team> teams = new ArrayList<>();
//        teams.add(new Team("CSK2","India","Faf Duplex","Cricket"));
//        teams.add(new Team("CSK1","India","Faf Duplex","Football"));
//
//        teamRepositoryImpl.saveAll(teams);

//        List<Team> teams1 = teamRepositoryImpl.findByName("CSK");
//        System.out.println(teams1);
//
//        List<Team> teams2 = teamRepositoryImpl.findByCategoryType("Football");
//        System.out.println(teams2);



        System.out.println("Loading done....");
    }

}
