package org.xworkz.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;


@ToString
@Setter
@Getter
public class ComplaintRegisterDTO {

    @NotNull(message = "vendor name should not be null")
    @NotBlank(message = "vendor name should not be null")
    @NotEmpty(message = "vendor name should not be null")
    private String vendor;

    @NotNull(message = "vendor name should not be null")
    private String name;

    @Email(message = "Please provide valid email.")
    private String email;

    private String purchaseDate;

    @NotNull(message = "Problem Description should not be null")
    private String problemDescription;

    public ComplaintRegisterDTO(){
        System.out.println("ComplaintRegisterDTO is created.");
    }

}
