package com.solvd.citytransportationsystemproject.models;

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
}
