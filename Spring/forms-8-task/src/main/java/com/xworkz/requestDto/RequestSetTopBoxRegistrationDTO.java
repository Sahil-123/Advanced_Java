package com.xworkz.requestDto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
public class RequestSetTopBoxRegistrationDTO {

    @NotBlank(message = "Customer Name is required")
    @Size(min = 3, max = 30, message = "Customer Name must be between 3 and 30 characters")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Customer Name must contain only letters")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", message="Email must be valid")
    private String email;

    @NotNull(message = "Gender is required")
    private String gender;

    @NotBlank(message = "Country is required")
    private String country;

    @NotBlank(message = "Description is required")
    @Size(min = 3, max = 300, message = "Description must be greater than 3 and less than 300 characters")
    private String description;

    @NotNull(message = "You must agree to the Terms & Conditions")
    private String termsAndCondition;

    public RequestSetTopBoxRegistrationDTO() {
        System.out.println("RequestSetTopBoxRegistrationDTO object is created..");
    }
}
