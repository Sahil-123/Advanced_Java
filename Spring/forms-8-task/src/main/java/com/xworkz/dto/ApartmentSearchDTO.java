package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name = "apartment_search")
@NamedQuery(name = "findByStartDate",query ="select apartment from ApartmentSearchDTO apartment where apartment.startDate = : startDate" )
@NamedQuery(name = "findByApartmentSearchId",query ="select apartment from ApartmentSearchDTO apartment where apartment.id = : id" )
public class ApartmentSearchDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "apartment_size")
    private String apartmentSize;

    @Column(name = "rental_term")
    private String rentalTerm;

    @Column(name = "features")
    private String features;

    @Column(name = "start_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    @Column(name = "special_request")
    private String specialRequest;

    public ApartmentSearchDTO() {
        System.out.println("ApartmentSearchDTO object is created..");
    }
}
