package org.xworkz.dto;

public class MatromonyRegisterDTO {

    private String name;
    private Integer age;

    private String gender;

    private String maritalStatus;

    private String religion;

    private String job;

    private String lookingFor;

    public MatromonyRegisterDTO() {
        System.out.println("MatromonyRegisterDTO is created...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getLookingFor() {
        return lookingFor;
    }

    public void setLookingFor(String lookingFor) {
        this.lookingFor = lookingFor;
    }

    @Override
    public String toString() {
        return "MatromonyRegisterDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", religion='" + religion + '\'' +
                ", job='" + job + '\'' +
                ", lookingFor='" + lookingFor + '\'' +
                '}';
    }
}
