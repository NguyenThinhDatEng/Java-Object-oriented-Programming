package com.home.abstraction;

public class FullTimeEmployee extends Employee_IEmployee{
	
	public FullTimeEmployee(String name, int paymentPerHour)
	{
		super(name, paymentPerHour);
	}
	
	@Override
	public int calculateSalary() {
		return 8 * super.getPaymentPerHour();
	}
}
