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
@Table(name = "feedback")
public class FeedbackDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "emotions")
    private String emotions;

    @Column(name = "satisfaction")
    private String satisfaction;

    @Column(name = "comments")
    private String comments;

    public FeedbackDTO() {
        System.out.println("FeedbackDTO object is created..");
    }
}
