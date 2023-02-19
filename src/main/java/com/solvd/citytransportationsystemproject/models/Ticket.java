package com.solvd.citytransportationsystemproject.models;

public class Ticket extends Model {
    private String paymentMethod;
    private float fare;
    private long passengerId;
    
    public Ticket() {
		super();
	}

	public Ticket(long id, String paymentMethod, float fare, long passengerId) {
        super(id);
        this.paymentMethod = paymentMethod;
        this.fare = fare;
        this.passengerId = passengerId;
    }

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public float getFare() {
		return fare;
	}

	public void setFare(float fare) {
		this.fare = fare;
	}

	public long getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(long passengerId) {
		this.passengerId = passengerId;
	}

    
}
