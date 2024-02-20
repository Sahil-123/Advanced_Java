package com.xworkz.DTO;

import com.xworkz.Runner.MedicineRunner;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MedicineDTO implements Serializable, Comparable<MedicineDTO> {
    private String name;
    private Integer id;
    private String company;
    private LocalDate manfDate;
    private LocalDate expiryDate;
    private Double cost;

    private List<String> ingredients = new ArrayList<>();

    @Override
    public int compareTo(MedicineDTO o) {
        return this.company.compareTo(o.company);
    }
}
