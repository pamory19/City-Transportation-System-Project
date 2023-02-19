package com.solvd.citytransportationsystemproject.models;

import java.sql.Date;
import java.util.Objects;

public class VehicleMaintenance extends Model {
    private Date date;
    private String type;
    private String description;
    private long vehicleId;
    
    public VehicleMaintenance() {
		super();
	}

	public VehicleMaintenance(long id, Date date, String type, String description, long vehicleId) {
        super(id);
        this.date = date;
        this.type = type;
        this.description = description;
        this.vehicleId = vehicleId;
    }

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}


	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof VehicleMaintenance)) {
			return false;
		}
		VehicleMaintenance maintenance = (VehicleMaintenance) o;
		return this.getId() == maintenance.getId() &&
				this.date.equals(maintenance.getDate()) &&
				this.type.equals(maintenance.getType()) &&
				this.description.equals(maintenance.getDescription()) &&
				this.vehicleId == maintenance.getVehicleId();
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getId(), this.date, this.type, this.description, this.vehicleId);
	}
    
}
