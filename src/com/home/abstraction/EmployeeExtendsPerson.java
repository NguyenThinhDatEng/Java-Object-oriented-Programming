package com.home.abstraction;

public class EmployeeExtendsPerson extends Person{
	private int salary;
	
	public EmployeeExtendsPerson() {
	}
	
	public EmployeeExtendsPerson(String name, String address, int salary) {
		super(name, address);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public void display()
	{
		System.out.println("Employee name: " + super.getName());
		System.out.println("Employee address: " + super.getAddress());
		System.out.println("Employee salary: " + salary);
	}
}
