package com.solvd.citytransportationsystemproject.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("Train")
@XmlRootElement(name = "Train")
@XmlAccessorType(XmlAccessType.FIELD)

public class Train extends Vehicle {
	
	@JsonProperty("trainHeadcode")
    @XmlElement
    private String trainHeadcode;
	
	@JsonProperty("vehicleId")
    @XmlElement
    private long vehicleId;
   
    public Train() {
		super();
	}

	public Train(long id, String make, String model, int year, int capacity, long driverId, String trainHeadcode, long vehicleId) {
        super(id, make, model, year, capacity, driverId);
        this.trainHeadcode = trainHeadcode;
        this.vehicleId = vehicleId;
    }

	public String getTrainHeadcode() {
		return trainHeadcode;
	}

	public void setTrainHeadcode(String trainHeadcode) {
		this.trainHeadcode = trainHeadcode;
	}

	public long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}

    
}

