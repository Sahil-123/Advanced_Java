package org.xworkz.dto;

import javax.persistence.*;


@Entity
@Table(name = "team")
@NamedQuery(name = "updateCountryByTeamName", query = "update TeamDTO set country = :country where name = :teamName")
@NamedQuery(name = "deleteTeamByName", query = "delete from TeamDTO t where name = : teamName")
@NamedQuery(name = "fetchTeamNameAndNoOfMatchesOfAllTeams", query = "select t.name, t.noOfMatches from TeamDTO t")
@NamedQuery(name = "fetchTotalNoOfMatchesByCategoryType", query = "select sum(t.noOfMatches) from TeamDTO t where t.catogoryType = :catogoryType")
@NamedQuery(name = "minOfNumberOfMatches", query = "select min(t.noOfMatches) from TeamDTO t")
@NamedQuery(name = "getTeamsOfMinNoOfMatches", query = "select t from TeamDTO t where t.noOfMatches =: noOfMatches")

public class TeamDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    private String country;
    private String captain;

    @Column(name = "catogory_type")
    private String catogoryType;

    @Column(name = "number_of_matches")
    private Integer noOfMatches;

    public TeamDTO() {
    }

    public TeamDTO(String name, String country, String captain, String catogoryType, Integer noOfMatches) {
        this.name = name;
        this.country = country;
        this.captain = captain;
        this.catogoryType = catogoryType;
        this.noOfMatches = noOfMatches;
    }

    public Integer getNoOfMatches() {
        return noOfMatches;
    }

    public void setNoOfMatches(Integer noOfMatches) {
        this.noOfMatches = noOfMatches;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public String getCatogoryType() {
        return catogoryType;
    }

    public void setCatogoryType(String catogoryType) {
        this.catogoryType = catogoryType;
    }

    @Override
    public String toString() {
        return "TeamDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", captain='" + captain + '\'' +
                ", catogoryType='" + catogoryType + '\'' +
                ", noOfMatches=" + noOfMatches +
                '}';
    }
}
