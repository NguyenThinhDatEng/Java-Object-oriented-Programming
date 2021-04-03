package com.home.abstraction;

public class PartTimeEmployee extends Employee_IEmployee{
	private int workingHours;

	public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
		super(name, paymentPerHour);
		this.workingHours = workingHours;
	}
	
	@Override
	public int calculateSalary() {
		return workingHours*super.getPaymentPerHour();
	}
}
