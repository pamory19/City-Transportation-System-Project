package com.solvd.citytransportationsystemproject.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("Route")
@XmlRootElement(name = "Route")
@XmlAccessorType(XmlAccessType.FIELD)

import java.util.List;

public class Route extends Model {

	@JsonProperty("name")
    @XmlElement
	private String name;
	
	@JsonProperty("vehicleID")
    @XmlElement
	private long vehicleId;
	
	@JsonProperty("stations")
    @XmlElement
	private List<Station> stations;
	
	public Route() {
		super();
	}

	public Route(long id, String name, long vehicleId, List<Station> stations) {
		super(id);
		this.name = name;
		this.vehicleId = vehicleId;
		this.stations = stations;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}

}
