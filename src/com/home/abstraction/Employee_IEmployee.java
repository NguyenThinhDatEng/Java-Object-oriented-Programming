package com.home.abstraction;

public abstract class Employee_IEmployee implements IEmployee {
	private String name;
	private int paymentPerHour;
	
	public Employee_IEmployee(String name, int paymentPerHour) {
		super();
		this.name = name;
		this.paymentPerHour = paymentPerHour;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPaymentPerHour() {
		return paymentPerHour;
	}

	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}
	
}
