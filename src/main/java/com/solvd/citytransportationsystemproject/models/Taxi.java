package com.solvd.citytransportationsystemproject.models;

import java.util.Objects;

public class Taxi extends Vehicle {
    private String licensePlate;
    private long vehicleId;
    
    public Taxi() {
		super();
	}

	public Taxi(long id, String make, String model, int year, int capacity, long driverId, String licensePlate, long vehicleId) {
        super(id, make, model, year, capacity, driverId);
        this.licensePlate = licensePlate;
        this.vehicleId = vehicleId;
    }

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Taxi))
			return false;
		Taxi taxi = (Taxi) obj;
		return super.equals(taxi) &&
				Objects.equals(licensePlate, taxi.licensePlate) &&
				vehicleId == taxi.vehicleId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), licensePlate, vehicleId);
	}


}
