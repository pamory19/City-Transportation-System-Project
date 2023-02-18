package com.solvd.citytransportationsystemproject.models;

import java.util.List;
import java.util.Objects;

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

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Route))
			return false;
		Route route = (Route) obj;
		return Objects.equals(name, route.name) &&
				vehicleId == route.vehicleId &&
				Objects.equals(stations, route.stations);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, vehicleId, stations);
	}

}
