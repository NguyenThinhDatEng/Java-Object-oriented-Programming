package com.home.abstraction;

public class Employee extends Person{
	private int salary;
	
	public Employee() {
	}
	
	public Employee(String name, String address, int salary) {
		super(name, address);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void display()
	{
		System.out.println("Salary: ");
	}
}
