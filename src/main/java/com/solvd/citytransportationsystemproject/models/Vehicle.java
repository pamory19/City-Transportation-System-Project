package com.solvd.citytransportationsystemproject.models;

public class Vehicle extends Model {
    private String make;
    private String model;
    private int year;
    private int capacity;
    private long driverId;
    
    public Vehicle() {
		super();
	}

	public Vehicle(long id, String make, String model, int year, int capacity, long driverId) {
        super(id);
        this.make = make;
        this.model = model;
        this.year = year;
        this.capacity = capacity;
        this.driverId = driverId;
    }

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public long getDriverId() {
		return driverId;
	}

	public void setDriverId(long driverId) {
		this.driverId = driverId;
	}
    
    
}
