package org.xworkz.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class ComplaintRegisterDTO {
    private String vendor;
    private String name;
    private String email;
    private String purchaseDate;
    private String problemDescription;

    public ComplaintRegisterDTO(){
        System.out.println("ComplaintRegisterDTO is created.");
    }
}
