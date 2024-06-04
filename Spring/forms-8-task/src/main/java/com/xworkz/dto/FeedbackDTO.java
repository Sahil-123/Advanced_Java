package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@ToString
public class FeedbackDTO {


    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 30, message = "Name must be between 3 and 30 characters")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = " Name must contain only letters")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "please enter valid email")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", message="Email must be valid")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    private String password;

    @NotNull(message = "At least one emotion must be selected")
    private List<String> emotions;

    @NotBlank(message = "Satisfaction level is required")
    private String satisfaction;

    @Size(max = 300, message = "Comments must be less than 300 characters")
    private String comments;

    public FeedbackDTO() {
        System.out.println("FeedbackDTO object is created..");
    }
}
