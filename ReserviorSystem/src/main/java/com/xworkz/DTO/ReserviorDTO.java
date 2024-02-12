package com.xworkz.DTO;

public class ReserviorDTO {

    private  int id;
    private String name;

    private String place;
    private String state;

    private double hight;

    public ReserviorDTO() {
    }

    public ReserviorDTO(String name, String place, String state, double hight) {
        this.name = name;
        this.place = place;
        this.state = state;
        this.hight = hight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "ReserviorDTO{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", state='" + state + '\'' +
                ", hight=" + hight +
                '}';
    }
}
