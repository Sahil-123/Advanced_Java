package com.xworkz.DTO;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonDTO {

    private String name;
    private String email;

    @Override
    public int hashCode() {
        return this.email.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.email.hashCode() == obj.hashCode();
    }
}
