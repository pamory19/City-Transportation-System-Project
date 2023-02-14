package com.solvd.citytransportationsystemproject.models;

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

}
