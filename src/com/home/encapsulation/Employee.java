package com.home.encapsulation;

public class Employee {
	private int id;
	private String firstName;
	private String name;
	private int salary;
	
	public Employee(int id, String firstName, String name, int salary)
	{
		this.id = id;
		this.firstName = firstName;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(String name, int salary)
	{
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void display()
	{
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}
}
