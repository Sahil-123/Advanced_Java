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
public class CountryDTO {
    private String countryCode;
    private String countryName;
    private String continent;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountryDTO that = (CountryDTO) o;

        return countryCode.equals(that.countryCode);
    }

    @Override
    public int hashCode() {
        return countryCode.hashCode();
    }
}