package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.*;
import java.util.List;

@Getter
@Setter
public class TravelReservationDTO {

    @NotBlank(message = "Full Name is required")
    @Size(min = 1, max = 100, message = "Full Name must be between 1 and 100 characters")
    private String fullName;

    @NotBlank(message = "Email address is required")
    @Email(message = "Please provide a valid email address")
    private String emailAddress;

    @NotBlank(message = "Tour package selection is required")
    private String tourPackage;

    @NotBlank(message = "Arrival date is required")
    private String arrivalDate;

    @NotNull(message = "Number of Persons is required")
    @Min(value = 1, message = "Number of Persons must be at least 1")
    private Integer numberOfPersons;

    @NotNull(message = "Amenities list cannot be null")
    @NotEmpty(message = "Amenities list cannot be empty")
    private List<String> amenities;

    @NotBlank(message = "Terms and condition selection is required")
    private String termsAndCondition;

    @Pattern(regexp = "[a-zA-Z0-9]{3,10}", message = "Discount Coupon Code must be alphanumeric and between 3 to 10 characters")
    private String discountCouponCode;

    public TravelReservationDTO() {
        System.out.println("TravelReservationDTO object is created..");
    }
}
