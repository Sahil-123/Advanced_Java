package org.xworkz.dto;


import javax.persistence.*;

@Entity
@Table(name = "player")
public class PlayerDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "jersey_number")
    private int jerseyNo;

    @Column(name = "category_type")
    private double categoryType;

    @Column(name = "team_id")
    private double team_id;
}
