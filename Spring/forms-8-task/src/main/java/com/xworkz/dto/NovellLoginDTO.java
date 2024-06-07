package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "novell_login")
public class NovellLoginDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "city_of")
    private String cityOf;

    @Column(name = "employment")
    private String employment;

    @Column(name = "web_server")
    private String webServer;

    @Column(name = "role")
    private String role;

    @Column(name = "single_sign_on")
    private String singleSignOn;

    public NovellLoginDTO() {
        System.out.println("NovellLoginDTO object is created..");
    }
}
