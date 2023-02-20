package com.solvd.citytransportationsystemproject.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("Driver")
@XmlRootElement(name = "Driver")
@XmlAccessorType(XmlAccessType.FIELD)

public class Driver extends Person{

	@JsonProperty("liscenseNumber")
    @XmlElement
	private String licenseNumber;
	
	@JsonProperty("yearsOfExperience")
    @XmlElement
    private int yearsOfExperience;
	
	@JsonProperty("personID")
    @XmlElement
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

