package com.solvd.citytransportationsystemproject.models;

import java.sql.Date;
import java.util.Objects;

public class AccidentReport extends Model {
    private Date date;
    private String description;
    private long personId;
    private long vehicleId;
    
    public AccidentReport() {
		super();
	}

	public AccidentReport(long id, Date date, String description, long personId, long vehicleId) {
        super(id);
        this.date = date;
        this.description = description;
        this.personId = personId;
        this.vehicleId = vehicleId;
    }

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof AccidentReport))
			return false;
		AccidentReport that = (AccidentReport) o;
		return getId() == that.getId() &&
				Objects.equals(getDate(), that.getDate()) &&
				Objects.equals(getDescription(), that.getDescription()) &&
				getPersonId() == that.getPersonId() &&
				getVehicleId() == that.getVehicleId();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getDate(), getDescription(), getPersonId(), getVehicleId());
	}
    
}

