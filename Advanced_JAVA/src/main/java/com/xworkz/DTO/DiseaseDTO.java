package com.xworkz.DTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DiseaseDTO {
    private String name;
    private String symptoms;
    private String treatment;
    private int duration; // Duration in weeks
}
