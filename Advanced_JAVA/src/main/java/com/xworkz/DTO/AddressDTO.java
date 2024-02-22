package com.xworkz.DTO;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AddressDTO {
    private int no;
    private String pincode;
    private String street;
}
