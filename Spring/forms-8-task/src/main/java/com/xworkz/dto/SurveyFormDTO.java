package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "survey_form")
public class SurveyFormDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "state")
    private String state;

    @Column(name = "how_did_you_hear_about_us")
    private String howDidYouHearAboutUs;

    @Column(name = "gender")
    private String gender;

    // Constructor, getter, setter methods
    public SurveyFormDTO() {
        System.out.println("SurveyFormDTO object is created..");
    }
}
