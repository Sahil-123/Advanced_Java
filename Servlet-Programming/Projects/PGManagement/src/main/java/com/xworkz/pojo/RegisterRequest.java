package com.xworkz.pojo;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RegisterRequest {
    private String name;
    private Integer age;

    private String gender;

    private String dob;

    private String address;
    private String phone;
    private String adhar;

    private String emergencyContact;
    private String username;
    private String password;
}
