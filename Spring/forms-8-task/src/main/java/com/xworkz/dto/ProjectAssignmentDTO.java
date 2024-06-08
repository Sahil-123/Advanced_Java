package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@Entity
@Table(name = "project_assignment")
@NamedQuery(name = "findByProjectAssignmentId", query = "select projectAssignment from ProjectAssignmentDTO projectAssignment where projectAssignment.id = :id")
@NamedQuery(name = "findByProjectName", query = "select projectAssignment from ProjectAssignmentDTO projectAssignment where projectAssignment.projectName = :projectName")

public class ProjectAssignmentDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "assignment_to")
    private String assignmentTo;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "priority")
    private String priority;

    @Column(name = "description")
    private String description;

    public ProjectAssignmentDTO() {
        System.out.println("ProjectAssignmentDTO object is created..");
    }
}
