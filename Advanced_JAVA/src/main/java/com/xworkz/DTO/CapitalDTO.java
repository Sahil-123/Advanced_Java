package com.xworkz.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CapitalDTO {
    private String capitalName;
    private String capitalCode; // Using capitalCode instead of countryCode
    private int population;
}