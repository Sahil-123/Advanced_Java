package org.xworkz.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ContactDTO {
    private String name;
    private String email;

    private String mobile;

    private String comment;

    public ContactDTO(){
        System.out.println("Contact DTO is created.");
    }
}
