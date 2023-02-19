package com.solvd.citytransportationsystemproject.models;

import java.util.Objects;

public class Passenger extends Person {
	
    private int numberOfRides;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Passenger passenger = (Passenger) o;
        return numberOfRides == passenger.numberOfRides && personId == passenger.personId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfRides, personId);
    }
}
