package com.xworkz.dto;


import java.time.LocalDate;

public class bookDTO {
    private String name;
    private String genres;

    private String auther;
    private LocalDate publicationYear;

    private Integer rating;
    private Double price;

    public bookDTO() {
    }

    public bookDTO(String name, String genres, String auther, LocalDate publicationYear, Integer rating, Double price) {
        this.name = name;
        this.genres = genres;
        this.auther = auther;
        this.publicationYear = publicationYear;
        this.rating = rating;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public LocalDate getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(LocalDate publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "bookDTO{" +
                "name='" + name + '\'' +
                ", genres='" + genres + '\'' +
                ", auther='" + auther + '\'' +
                ", publicationYear=" + publicationYear +
                ", rating=" + rating +
                ", price=" + price +
                '}';
    }
}
