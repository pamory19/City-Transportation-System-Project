package com.solvd.citytransportationsystemproject.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("Vehicle")
@XmlRootElement(name = "Vehicle")
@XmlAccessorType(XmlAccessType.FIELD)

public class Vehicle extends Model {
	
	@JsonProperty("make")
    @XmlElement
    private String make;
	
	@JsonProperty("model")
    @XmlElement
    private String model;
	
	@JsonProperty("year")
    @XmlElement
    private int year;
	
	@JsonProperty("capacity")
    @XmlElement
    private int capacity;
	
	@JsonProperty("driverID")
    @XmlElement
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
