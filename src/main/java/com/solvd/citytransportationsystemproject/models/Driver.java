package com.solvd.citytransportationsystemproject.models;

public class Driver extends Person{

    private String licenseNumber;
    private int yearsOfExperience;
    private long personId;
    
    public Driver(long id, String firstName, String lastName, String address, String phoneNumber, String email, String licenseNumber, int yearsOfExperience, long personId) {
        super(id, firstName, lastName, address, phoneNumber, email);
        this.licenseNumber = licenseNumber;
        this.yearsOfExperience = yearsOfExperience;
        this.personId = personId;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }
}

