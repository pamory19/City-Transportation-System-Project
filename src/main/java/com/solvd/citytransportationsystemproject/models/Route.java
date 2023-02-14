package com.solvd.citytransportationsystemproject.models;

import java.util.List;

public class Route extends Model {

	private String name;
	private long vehicleId;
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
