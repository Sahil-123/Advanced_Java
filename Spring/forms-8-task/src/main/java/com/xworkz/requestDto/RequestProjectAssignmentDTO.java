package com.xworkz.requestDto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Getter
@Setter
@ToString
public class RequestProjectAssignmentDTO {

    @NotBlank(message = "Project Name is required")
    @Size(min = 3, max = 30, message = "Project Name must be between 3 and 30 characters")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Project Name must contain only letters")
    private String projectName;

    @NotBlank(message = "Assignment to is required")
    private String assignmentTo;

    @NotNull(message = "Start Date is required")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    @NotNull(message = "End Date is required")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;

    @NotBlank(message = "Priority is required")
    private String priority;

    @NotBlank(message = "Description is required")
    @Size(min = 3, max = 300, message = "Description must be greater than 3 and less than 300 characters")
    private String description;

    public RequestProjectAssignmentDTO() {
        System.out.println("RequestProjectAssignmentDTO object is created..");
    }
}
