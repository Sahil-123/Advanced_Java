package com.xworkz.dto;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "customer_login")
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class CustomerLogin implements Serializable {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String username;

//    @Column(name = "secret")
    private String password;

    @Column(name = "customer_id")
    private Integer customerId;
}
