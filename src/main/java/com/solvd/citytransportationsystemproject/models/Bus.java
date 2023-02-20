package com.solvd.citytransportationsystemproject.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("Bus")
@XmlRootElement(name = "Bus")
@XmlAccessorType(XmlAccessType.FIELD)

public class Bus extends Vehicle {
	
	@JsonProperty("busNumber")
    @XmlElement
	private int busNumber;
	
	@JsonProperty("vehicleID")
    @XmlElement
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
