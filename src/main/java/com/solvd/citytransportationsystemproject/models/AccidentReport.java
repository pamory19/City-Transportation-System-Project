package com.solvd.citytransportationsystemproject.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.sql.Date;

@JsonRootName("AccidentReport")
@XmlRootElement(name = "AccidentReport")
@XmlAccessorType(XmlAccessType.FIELD)

public class AccidentReport extends Model {
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@JsonProperty("date")
	@XmlElement
	private Date date;
    
	@JsonProperty("description")
    @XmlElement
	private String description;
	
	@JsonProperty("personID")
    @XmlElement
	private long personId;
	
	@JsonProperty("vehicleID")
    @XmlElement
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

    
}

