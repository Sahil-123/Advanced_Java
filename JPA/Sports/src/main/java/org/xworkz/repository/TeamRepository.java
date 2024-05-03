package org.xworkz.repository;

import org.xworkz.dto.TeamDTO;

import java.util.List;

public interface TeamRepository {

    public void save(TeamDTO teamDTO);

    public void saveAll(List<TeamDTO> teamDTOS);

    public TeamDTO find(Integer id);

    public void update(Integer id, String teamName);

    public void delete(Integer id);

    public List<TeamDTO> findByName(String name);

    public List<TeamDTO> findByCategoryType(String categoryType);


//  ----------- Missed classes methods to implement.

    public Integer findCountOfRecords();

    public Integer getNoOfMatchesById(int id);

    public String findCountryByTeamName(String teamName);

    public List<List<String>> findCountryAndCategoryTypeByTeamName(String teamName);

    public TeamDTO fetchTeamByNames(String teamName);


//   --- Named Queries.

    public Integer updateCountryByTeamName(String teamName, String country);

    public Integer deleteTeamByName(String name);

    public List<List<String>> fetchTeamNameAndNoOfMatchesOfAllTeams();

    public Integer fetchTotalNoOfMatchesByCategoryType(String categoryType);

    public List<TeamDTO> getTeamsOfMinNoOfMatches();

//    --- criteriaBuilder------

    public List<TeamDTO> findAllTeams();

    public List<String> getCountries();

    public  List<List<String>> getCountryAndTeamNameOfAllTeams();

    public TeamDTO findTeamByTeamName(String team);

    public List<TeamDTO> getTeamsByNameMatcher(String teamNameMatcher);

//    --- Players Table
    public List<TeamDTO> findTeamsByLessThanTheNumberOfPlayer(Integer numberOfPlayers);

    public List<TeamDTO> findTeamsByNoOfPlayersInBetween(Integer val1, Integer val2);

    public List<TeamDTO> findTeamsByNameOfTeams(List<String> teamNames);

//    ---- joins ---

//    public  TeamDTO createPlayer(List<PlayerDTO> playerDTOS);
//
//    public  void getTeamNameWithPlayerName();


}
