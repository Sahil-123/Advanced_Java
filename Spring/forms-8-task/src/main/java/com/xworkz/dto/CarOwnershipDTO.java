package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name = "car_ownership")
@NamedQuery(name = "findByState",query ="select carOwner from CarOwnershipDTO carOwner where carOwner.stateResidence = : state" )
@NamedQuery(name = "findByCarOwnerId",query ="select carOwner from CarOwnershipDTO carOwner where carOwner.id = : id" )
public class CarOwnershipDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "favorite_sport")
    private String favoriteSport;

    @Column(name = "gender")
    private String gender;

    @Column(name = "state_residence")
    private String stateResidence;

    @Column(name = "car_owned")
    private String carOwned;

    public CarOwnershipDTO() {
        System.out.println("CarOwnershipDTO object is created..");
    }
}
