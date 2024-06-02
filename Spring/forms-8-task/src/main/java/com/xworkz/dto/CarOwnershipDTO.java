package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@ToString
public class CarOwnershipDTO {

    @NotBlank(message = "First Name is required")
    @Size(min = 1, max = 50, message = "First Name must be between 1 and 50 characters")
    private String firstName;

    @NotBlank(message = "Last Name is required")
    @Size(min = 1, max = 50, message = "Last Name must be between 1 and 50 characters")
    private String lastName;

    @NotBlank(message = "Favorite Sport is required")
    private String favoriteSport;

    @NotBlank(message = "Gender is required")
    private String gender;

    @NotBlank(message = "State Residence is required")
    private String stateResidence;

    @NotNull(message = "At least one car must be selected")
    private List<String> carOwned;

    public CarOwnershipDTO() {
        System.out.println("CarOwnershipDTO object is created..");
    }
}
