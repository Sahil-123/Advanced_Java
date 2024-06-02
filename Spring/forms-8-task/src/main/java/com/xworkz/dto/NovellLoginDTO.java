package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;


import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@ToString
public class NovellLoginDTO {

    @NotBlank(message = "Username is required")
    @Size(min = 1, max = 50, message = "Username must be between 1 and 50 characters")
    private String username;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;

    @NotBlank(message = "City of is required")
    @Size(min = 1, max = 50, message = "City of must be between 1 and 50 characters")
    private String cityOf;

    @NotBlank(message = "Employment is required")
    @Size(min = 1, max = 50, message = "Employment must be between 1 and 50 characters")
    private String employment;

    @NotBlank(message = "Please select a web server")
    private String webServer;

    @NotBlank(message = "Please specify your role")
    private String role;

    @NotEmpty(message = "Please select at least one single sign-on option")
    private List<String> singleSignOn;

    public NovellLoginDTO() {
        System.out.println("NovellLoginDTO object is created..");
    }
}
