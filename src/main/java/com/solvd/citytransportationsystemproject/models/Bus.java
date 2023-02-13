package com.solvd.citytransportationsystemproject.models;

public class Bus extends Vehicle {
    private int busNumber;
    private long vehicleId;
    
    public Bus() {
		super();
	}

	public Bus(long id, String make, String model, int year, int capacity, long driverId, int busNumber, long vehicleId) {
        super(id, make, model, year, capacity, driverId);
        this.busNumber = busNumber;
        this.vehicleId = vehicleId;
    }

	public int getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}

	public long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}

    
}
