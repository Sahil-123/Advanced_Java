package com.xworkz.dto;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "customer")
@Getter
@Setter
//@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer customerId;

    private String name;

    private Integer age;

    private String gender;

    private LocalDate dob;

    private String address;

    private String phone;

    private String adhar;

    @Column(name = "emergency_contact")
    private String  emergencyContact;

}
