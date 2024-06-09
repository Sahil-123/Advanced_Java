package com.xworkz.requestDto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.*;
import java.util.List;

@Getter
@Setter
@ToString
public class RequestCarOwnershipDTO {

    @NotBlank(message = "First Name is required")
    @Size(min = 1, max = 50, message = "First Name must be between 1 and 50 characters")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "First Name must contain only letters")
    private String firstName;

    @NotBlank(message = "Last Name is required")
    @Size(min = 1, max = 50, message = "Last Name must be between 1 and 50 characters")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Last Name must contain only letters")
    private String lastName;

    @NotBlank(message = "Favorite Sport is required")
    private String favoriteSport;

    @NotBlank(message = "Gender is required")
    private String gender;

    @NotBlank(message = "State Residence is required")
    private String stateResidence;

    @NotNull(message = "At least one car must be selected")
    private List<String> carOwned;

    public RequestCarOwnershipDTO() {
        System.out.println("RequestCarOwnershipDTO object is created..");
    }
}