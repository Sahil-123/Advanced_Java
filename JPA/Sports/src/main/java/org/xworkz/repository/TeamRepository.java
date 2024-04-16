package org.xworkz.repository;

import org.xworkz.dto.Team;

import java.util.List;

public interface TeamRepository {

    public void save(Team team);

    public void saveAll(List<Team> teams);

    public Team find(Integer id);

    public List<Team> findByName(String name);

    public List<Team> findByCategoryType(String categoryType);

    public void update(Integer id, String teamName);

    public void delete(Integer id);
}
