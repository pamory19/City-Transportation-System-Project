package com.solvd.citytransportationsystemproject.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("Station")
@XmlRootElement(name = "Station")
@XmlAccessorType(XmlAccessType.FIELD)

public class Station extends Model {
	
	@JsonProperty("name")
    @XmlElement
    private String name;
	
	@JsonProperty("type")
    @XmlElement
    private String type;
	
	@JsonProperty("address")
    @XmlElement
    private String address;
	
	@JsonProperty("routeID")
    @XmlElement
    private long routeId;
    
    public Station() {
		super();
	}

	public Station(long id, String name, String type, String address, long routeId) {
        super(id);
        this.name = name;
        this.type = type;
        this.address = address;
        this.routeId = routeId;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getRouteId() {
		return routeId;
	}

	public void setRouteId(long routeId) {
		this.routeId = routeId;
	}

    
}
