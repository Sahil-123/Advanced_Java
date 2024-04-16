package org.xworkz.dto;

import javax.persistence.*;


@Entity
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    private String country;
    private String captain;

    @Column(name = "catogory_type")
    private String catogoryType;

    public Team() {
    }

    public Team(String name, String country, String captain, String catogoryType) {
        this.name = name;
        this.country = country;
        this.captain = captain;
        this.catogoryType = catogoryType;
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
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", captain='" + captain + '\'' +
                ", catogoryType='" + catogoryType + '\'' +
                '}';
    }
}
