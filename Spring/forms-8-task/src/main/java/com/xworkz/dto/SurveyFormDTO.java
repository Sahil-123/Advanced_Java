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
public class SurveyFormDTO {

    @NotBlank(message = "Email address is required")
    @Email(message = "Please provide a valid email address")
    private String emailAddress;

    @NotBlank(message = "First Name is required")
    @Size(min = 1, max = 50, message = "First Name must be between 1 and 50 characters")
    private String firstName;

    @NotBlank(message = "Last Name is required")
    @Size(min = 1, max = 50, message = "Last Name must be between 1 and 50 characters")
    private String lastName;

    @NotBlank(message = "State is required")
    private String state;

    @NotEmpty(message = "At least one option must be selected")
    private List<String> howDidYouHearAboutUs;

    @NotBlank(message = "Gender is required")
    private String gender;

    public SurveyFormDTO() {
        System.out.println("ContactFormDTO object is created..");
    }
}
