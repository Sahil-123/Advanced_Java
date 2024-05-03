package org.xworkz.dto;


import javax.persistence.*;

@Entity
@Table(name = "cartoonTable")
@NamedQuery(name = "getCartoonByName", query = "Select t from Cartoon t where t.name=:name")
@NamedQuery(name = "getCartoonByGenderMatches", query = "Select t from Cartoon t where t.gender like :gender ")
@NamedQuery(name = "getCartoonByTypes", query = "Select t from Cartoon t where t.type IN (:types) ")
public class Cartoon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String gender;
    private String author;
    private String type;

    public Cartoon() {
    }

    public Cartoon(String name, String gender, String author, String type) {
        this.name = name;
        this.gender = gender;
        this.author = author;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cartoon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
