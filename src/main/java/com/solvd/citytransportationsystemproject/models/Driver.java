package com.solvd.citytransportationsystemproject.models;

import java.util.Objects;

public class Driver extends Person{

    private String licenseNumber;
    private int yearsOfExperience;
    private long personId;

    public Driver(){
        super();
    }
    
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Driver))
            return false;
        if (!super.equals(o))
            return false;
        Driver driver = (Driver) o;
        return yearsOfExperience == driver.yearsOfExperience &&
                personId == driver.personId &&
                Objects.equals(licenseNumber, driver.licenseNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), licenseNumber, yearsOfExperience, personId);
    }
}

