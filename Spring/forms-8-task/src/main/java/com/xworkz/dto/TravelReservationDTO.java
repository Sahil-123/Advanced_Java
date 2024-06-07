package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "TravelReservation")
public class TravelReservationDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "tour_package")
    private String tourPackage;

    @Column(name = "arrival_date")
    private String arrivalDate;

    @Column(name = "number_of_persons")
    private Integer numberOfPersons;

    @Column(name = "amenities")
    private String amenities;

    @Column(name = "terms_and_condition")
    private String termsAndCondition;

    @Column(name = "discount_coupon_code")
    private String discountCouponCode;

    // Constructor, getter, setter methods
    public TravelReservationDTO() {
        System.out.println("TravelReservationDTO object is created..");
    }
}
