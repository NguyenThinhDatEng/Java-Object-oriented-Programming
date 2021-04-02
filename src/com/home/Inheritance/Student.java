package com.home.Inheritance;

import com.home.encapsulation.Person;

public class Student extends Person {

	private double gpa;
	
	public Student(String name, int age, String address, double gpa)
	{
		super(name, age, address);
		this.gpa = gpa;
	}

	public Student(String name, int dob, double gpa)
	{
		super(name, dob);
		this.gpa = gpa;
	}

	public double getGpa()
	{
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public void display(){
	    super.display();
	    System.out.println("Gpa: " + gpa);
	}
}