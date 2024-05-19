package com.xworkz.dto;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "customer_login")
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class CustomerLogin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer customerId;

    private String username;
    private String password;
}
