package org.xworkz;

import org.xworkz.dto.TeamDTO;
import org.xworkz.repository.TeamRepositoryImpl;

import java.util.ArrayList;
import java.util.Arrays;
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

        teamRepositoryImpl.update(6,"MI");

        teamRepositoryImpl.delete(6);

        TeamDTO team = teamRepositoryImpl.find(6);
        System.out.println(team);

        List<TeamDTO> teams = new ArrayList<>();
        teams.add(new TeamDTO("CSK2","India","Faf Duplex","Cricket",20));
        teams.add(new TeamDTO("CSK1","India","Faf Duplex","Football",39));

        teamRepositoryImpl.saveAll(teams);

        List<TeamDTO> teams1 = teamRepositoryImpl.findByName("CSK");
        System.out.println(teams1);

        List<TeamDTO> teams2 = teamRepositoryImpl.findByCategoryType("Football");
        System.out.println(teams2);

//        ------------  missing functions ---------------

        System.out.println(teamRepositoryImpl.findCountOfRecords());
        System.out.println(teamRepositoryImpl.getNoOfMatchesById(1));
        System.out.println(teamRepositoryImpl.findCountryByTeamName("Liverpool FC"));

        List<List<String>> list = teamRepositoryImpl.findCountryAndCategoryTypeByTeamName("Liverpool FC");
        list.forEach(e-> System.out.print("Country = "+e.get(0)+" : Category type = "+e.get(1)));


        System.out.println(teamRepositoryImpl.fetchTeamByNames("India National Cricket Team"));


//        -------- Named Queries ------
        System.out.println();
        System.out.println("------ Named Query -----------------");
        System.out.println();

        TeamDTO teamDTO=new TeamDTO("CSK2","India","Faf Duplex","Cricket",78);
        teamRepositoryImpl.save(teamDTO);

        System.out.println("updating team country by team name.");
        System.out.println(teamRepositoryImpl.updateCountryByTeamName("CSK2","Karnataka"));
        System.out.println(teamRepositoryImpl.fetchTeamByNames("CSK2"));

        System.out.println("deleting team by name-");
        System.out.println(teamRepositoryImpl.deleteTeamByName("CSK2"));

        System.out.println("Fetching Team Name and No of matches of all team");
        List<List<String>> list1 = teamRepositoryImpl.fetchTeamNameAndNoOfMatchesOfAllTeams();
        list1.forEach(e-> System.out.print("Team Name = "+e.get(0)+" : No of Matches = "+e.get(1)+"\n"));

        System.out.println("finding total number of matches of category type cricket");
        System.out.println(teamRepositoryImpl.fetchTotalNoOfMatchesByCategoryType("Cricket"));

        System.out.println("getting the teams that have min number of matches");
        teamRepositoryImpl.getTeamsOfMinNoOfMatches().forEach(System.out::println);



//      ---- criteria builder -----

        System.out.println();
        System.out.println("------- criterial builder ---------");
        System.out.println();

        System.out.println("fetching all teams..");
        teamRepositoryImpl.findAllTeams().forEach(System.out::println);
        System.out.println();

        System.out.println("getting all countries..");
        System.out.println(teamRepositoryImpl.getCountries());
        System.out.println();

        System.out.println("getting country and team name of all teams..");
        teamRepositoryImpl.getCountryAndTeamNameOfAllTeams().forEach(e-> System.out.println("Team Name = "+e.getName()+" : Country = "+e.getCountry()));
        System.out.println();

        System.out.println("fetching team by team name----");
        System.out.println(teamRepositoryImpl.findTeamByTeamName("India National Cricket Team"));
        System.out.println();

        System.out.println("finding team by name matcher...");
        teamRepositoryImpl.getTeamsByNameMatcher("India National Cricket Team").forEach(System.out::println);
        System.out.println();

        System.out.println("finding the team who have less than 12 players.");
        teamRepositoryImpl.findTeamsByLessThanTheNumberOfPlayer(12).forEach(System.out::println);
        System.out.println();

        System.out.println("finding the team who have players in between 12 to 20");
        teamRepositoryImpl.findTeamsByNoOfPlayersInBetween(12,20).forEach(System.out::println);
        System.out.println();

        List<String> teamNames = new ArrayList<>();
        teamNames.add("India National Cricket Team");
        teamNames.add("Liverpool FC");

        System.out.println("finding the teams by the name of the teams.");
        teamRepositoryImpl.findTeamsByNameOfTeams(teamNames).forEach(System.out::println);
        System.out.println();


//        -------------------------------------

        System.out.println("Task execution completed... ");
    }

}
