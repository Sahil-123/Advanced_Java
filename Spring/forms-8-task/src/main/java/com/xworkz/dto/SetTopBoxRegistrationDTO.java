package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "set_top_box_registration")
public class SetTopBoxRegistrationDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "gender")
    private String gender;

    @Column(name = "country")
    private String country;

    @Column(name = "description")
    private String description;

    @Column(name = "terms_and_condition")
    private String termsAndCondition;

    public SetTopBoxRegistrationDTO() {
        System.out.println("SetTopBoxRegistrationDTO object is created..");
    }
}
