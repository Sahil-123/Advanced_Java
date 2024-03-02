package com.xworkz.dto;

import java.util.Objects;

public class bikeShowRoomDTO {
    private String name;
    private String city;
    private Integer pinCode;

    public bikeShowRoomDTO(String name, String city, Integer pinCode) {
        this.name = name;
        this.city = city;
        this.pinCode = pinCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name,this.city,this.pinCode);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof bikeShowRoomDTO that)) return false;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getCity(), that.getCity()) && Objects.equals(getPinCode(), that.getPinCode());
    }

    @Override
    public String toString() {
        return "bikeShowRoomDTO{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
