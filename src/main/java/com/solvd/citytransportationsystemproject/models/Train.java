package com.solvd.citytransportationsystemproject.models;

import java.util.Objects;

public class Train extends Vehicle {
    private String trainHeadcode;
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


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Train))
			return false;
		Train train = (Train) obj;
		return super.equals(train) &&
				Objects.equals(trainHeadcode, train.trainHeadcode) &&
				vehicleId == train.vehicleId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), trainHeadcode, vehicleId);
	}

}

