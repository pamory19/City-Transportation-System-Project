package com.solvd.citytransportationsystemproject.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("Passenger")
@XmlRootElement(name = "Passenger")
@XmlAccessorType(XmlAccessType.FIELD)

public class Passenger extends Person {
	
	@JsonProperty("numberOfRides")
    @XmlElement
    private int numberOfRides;
	
	@JsonProperty("personId")
    @XmlElement
    private long personId;
    
    
    
    public Passenger() {
		super();
	}

	public Passenger(long id, String firstName, String lastName, String address, String phoneNumber, String email, int numberOfRides, long personId) {
        super(id, firstName, lastName, address, phoneNumber, email);
        this.numberOfRides = numberOfRides;
        this.personId = personId;
    }

    public int getNumberOfRides() {
        return numberOfRides;
    }

    public void setNumberOfRides(int numberOfRides) {
        this.numberOfRides = numberOfRides;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }
}
