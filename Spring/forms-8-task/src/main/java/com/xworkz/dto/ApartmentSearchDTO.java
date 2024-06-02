package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.*;
import java.util.List;

@Getter
@Setter
@ToString
public class ApartmentSearchDTO {

    @NotBlank(message = "Occupant First Name is required")
    @Size(min = 1, max = 50, message = "Occupant First Name must be between 1 and 50 characters")
    private String firstName;

    @NotBlank(message = "Occupant Last Name is required")
    @Size(min = 1, max = 50, message = "Occupant Last Name must be between 1 and 50 characters")
    private String lastName;

    @NotBlank(message = "Phone is required")
    @Pattern(regexp="\\d{10}", message = "Phone must be 10 digits")
    private String phone;

    @NotBlank(message = "Email is required")
    @Email(message = "Please provide a valid email address")
    private String email;

    @NotBlank(message = "Apartment Size is required")
    private String apartmentSize;

    @NotBlank(message = "Rental Term is required")
    private String rentalTerm;

    @NotEmpty(message = "At least one feature must be selected")
    private List<String> features;

    @NotBlank(message = "Start Date is required")
    private String startDate;

    @Size(max = 300, message = "Special Request must be less than 300 characters")
    private String specialRequest;

    public ApartmentSearchDTO() {
        System.out.println("ApartmentSearchDTO object is created..");
    }
}
