package com.xworkz.requestDto;

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
public class RequestTravelReservationDTO {

    @NotBlank(message = "Full Name is required")
    @Size(min = 1, max = 100, message = "Full Name must be between 1 and 100 characters")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Name must contain only letters")
    private String fullName;

    @NotBlank(message = "Email address is required")
    @Email(message = "Please provide a valid email address")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", message="Email must be valid")
    private String emailAddress;

    @NotBlank(message = "Tour package selection is required")
    private String tourPackage;

    @NotBlank(message = "Arrival date is required")
    private String arrivalDate;

    @NotNull(message = "Number of Persons is required")
    @Min(value = 1, message = "Number of Persons must be at least 1")
    private Integer numberOfPersons;

    @NotEmpty(message = "Amenities list cannot be empty")
    private List<String> amenities;

    @NotBlank(message = "Terms and condition selection is required")
    private String termsAndCondition;

    @Pattern(regexp = "[a-zA-Z0-9]{3,10}", message = "Discount Coupon Code must be alphanumeric and between 3 to 10 characters")
    private String discountCouponCode;

    public RequestTravelReservationDTO() {
        System.out.println("RequestTravelReservationDTO object is created..");
    }
}
